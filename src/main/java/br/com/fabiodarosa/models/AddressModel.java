package br.com.fabiodarosa.models;

import lombok.Data;

@Data
public class AddressModel {

  String street;
  Integer number;


  public class SecondStep {

    public String getStreet() {
      return street;
    }
  }

  public class ThirtyStep {

    public String getStreet() {
      return street;
    }

    public Integer getNumber() {
      return number;
    }

  }


}
