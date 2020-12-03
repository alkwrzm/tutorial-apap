package apap.tutorial.haidokter.repository;

import apap.tutorial.haidokter.model.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleDb extends JpaRepository<RoleModel,Long> {

}
