package br.eti.cvm.tacocloud.model;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Design {
    private String name;
    private List<Ingredient> ingredients;
}
