package ttsw.filopl.restfullwebservices;

import org.springframework.web.bind.annotation.*;

/**
 * Created by T. Filo Zegarlicki on 08.06.2022
 **/

@RestController
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String helloWorld() {
        return "hello";
    }

    @RequestMapping("/hello-bean")
    public HelloBean helloBean() {
        return new HelloBean("Hello Bean");
    }

    @GetMapping("/hello/path/{name}")
    public HelloBean helloBeanPathVariable(@PathVariable String name) {
        return new HelloBean(String.format("Hello Variable, %s", name));
    }

}
