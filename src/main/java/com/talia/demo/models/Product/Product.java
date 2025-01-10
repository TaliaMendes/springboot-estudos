package com.talia.demo.models.Product;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.*;

@Table(name = "Products")
@Entity
public class Product {
  
@Id 
@GeneratedValue(strategy = GenerationType.AUTO)
private UUID id;
private String name;
private BigDecimal value;

public UUID getId() {
  return id;
}

public void setID(UUID id) {
  this.id = id; 
}

public String getName() {
  return name;
}

public void setName(String name) {
  this.name = name;
}

public BigDecimal getValue() {
  return value;
}

public void setValue(BigDecimal value) {
  this.value = value;
}


}
