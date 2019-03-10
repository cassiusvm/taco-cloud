package br.eti.cvm.tacocloud.repository;

import br.eti.cvm.tacocloud.model.Order;

public interface OrderRepository {
    Order save(Order order);
}
