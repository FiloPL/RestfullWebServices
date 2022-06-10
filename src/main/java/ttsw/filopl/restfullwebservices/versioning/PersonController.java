package ttsw.filopl.restfullwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by T. Filo Zegarlicki on 10.06.2022
 **/

@RestController
public class PersonController {

    @GetMapping("/v1/person")
    public PersonX personX() {
        return new PersonX("Dogma Protone Icon");
    }

    @GetMapping("/v2/person")
    public PersonY personY() {
        return new PersonY(new Name("V1 Dogma", "Grevil Y"));
    }

    @GetMapping(value = "/person/param", params = "version=1")
    public PersonX paramX(){
        return new PersonX("Dogma Protone Icon Param X");
    }

    @GetMapping(value = "/person/param", params = "version=2")
    public PersonY paramY() {
        return new PersonY(new Name("V1 Dogma", "Grevil Param Y"));
    }

    @GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
    public PersonX headerX() {
        return new PersonX("Dogma Protone Icon header X");
    }

    @GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
    public PersonY headerY() {
        return new PersonY(new Name("V1 Dogma", "Grevil header Y"));
    }

    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v1+json")
    public PersonX producesX() {
        return new PersonX("Dogma Protone Icon produces X");
    }

    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v2+json")
    public PersonY producesY() {
        return new PersonY(new Name("V1 Dogma", "Grevil produces Y"));
    }
}
