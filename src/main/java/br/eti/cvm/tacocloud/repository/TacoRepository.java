package br.eti.cvm.tacocloud.repository;

import br.eti.cvm.tacocloud.model.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {

}
