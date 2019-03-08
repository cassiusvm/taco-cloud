package br.eti.cvm.tacocloud.repository;

import br.eti.cvm.tacocloud.model.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
