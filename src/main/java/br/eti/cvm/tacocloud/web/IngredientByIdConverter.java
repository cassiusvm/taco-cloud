package br.eti.cvm.tacocloud.web;

import br.eti.cvm.tacocloud.model.Ingredient;
import br.eti.cvm.tacocloud.repository.IngredientRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

  private IngredientRepository ingredientRepository;

  public IngredientByIdConverter(IngredientRepository ingredientRepository) {
    this.ingredientRepository = ingredientRepository;
  }
  
  @Override
  public Ingredient convert(String id) {
    return ingredientRepository.findById(id);
  }

}
