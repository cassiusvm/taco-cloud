package br.eti.cvm.tacocloud.repository;

import br.eti.cvm.tacocloud.model.Taco;

public interface TacoRepository {
    Taco save(Taco design);
}
