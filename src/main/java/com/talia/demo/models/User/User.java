package com.talia.demo.models.User;

import java.util.UUID;
import jakarta.persistence.*;

@Table(name = "user")
@Entity
public class User {
  
  @Id                   // é usada para marcar o campo que será a chave primária da tabela
  @GeneratedValue       
  private UUID id; 

  private String name;
  private String email; 
  private String password; 

  User( String name, String email, String password ) {
    this.name = name;
    this.email = email;
    this.password = password;
  }

  User() {

  }

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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
