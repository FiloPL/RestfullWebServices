package ttsw.filopl.restfullwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by T. Filo Zegarlicki on 08.06.2022
 **/

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int userCount = 5;

    static {
        users.add( new User(1, "Bella", new Date()));
        users.add( new User(2, "Filemon", new Date()));
        users.add( new User(3, "Merida", new Date()));
        users.add( new User(4, "Dzik", new Date()));
        users.add( new User(5, "Chika", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save( User user) {
        if(user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User findOne( int id) {
        for(User user : users) {
            if(user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User deleteByID(int id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}
