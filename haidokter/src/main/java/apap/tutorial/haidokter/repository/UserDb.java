package apap.tutorial.haidokter.repository;

import apap.tutorial.haidokter.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDb extends JpaRepository<UserModel,Long> {

    UserModel findByUsername(String username);
}
