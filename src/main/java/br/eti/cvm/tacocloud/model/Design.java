package br.eti.cvm.tacocloud.model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Design {
	private String name;
	private List<Ingredient> ingredients;
}
