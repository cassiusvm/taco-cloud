package br.eti.cvm.tacocloud.repository;

import br.eti.cvm.tacocloud.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
