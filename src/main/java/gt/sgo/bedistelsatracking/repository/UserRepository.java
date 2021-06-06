package gt.sgo.bedistelsatracking.repository;

import gt.sgo.bedistelsatracking.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findUserByEmailAndPassword(String user, String password);
}
