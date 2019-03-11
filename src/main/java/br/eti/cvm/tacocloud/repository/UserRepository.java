package br.eti.cvm.tacocloud.repository;

import br.eti.cvm.tacocloud.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
