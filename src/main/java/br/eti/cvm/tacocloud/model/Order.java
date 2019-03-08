package br.eti.cvm.tacocloud.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
}