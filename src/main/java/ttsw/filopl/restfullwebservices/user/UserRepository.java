package ttsw.filopl.restfullwebservices.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by T. Filo Zegarlicki on 14.06.2022
 **/

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}
