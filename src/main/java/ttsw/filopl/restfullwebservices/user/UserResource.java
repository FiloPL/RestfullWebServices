package ttsw.filopl.restfullwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by T. Filo Zegarlicki on 08.06.2022
 **/

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    public List<User> retriveAllUsers() {
        return service.findAll();
    }

}
