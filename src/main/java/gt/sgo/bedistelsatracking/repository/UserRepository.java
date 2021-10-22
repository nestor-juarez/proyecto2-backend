package gt.sgo.bedistelsatracking.repository;

import gt.sgo.bedistelsatracking.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Usuario, Integer> {

    Usuario findUsuarioByEmail(String mail);
}
