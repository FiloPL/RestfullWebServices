package ttsw.filopl.restfullwebservices.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

/**
 * Created by T. Filo Zegarlicki on 08.06.2022
 **/

@RestController
public class HelloController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloBean helloWorldBean() {
        return new HelloBean("Hello World");
    }

    ///hello-world/path-variable/in28minutes
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloBean(String.format("Hello World, %s", name));
    }

    @GetMapping(path = "/hello-world-internationalized")
    public String helloWorldInternationalized() {
        return messageSource.getMessage("good.morning.message", null,
                LocaleContextHolder.getLocale());
    }
}
