package br.com.fabiodarosa.models;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ModelClass {
// --------------------------------- CLASS PROPERTIES ---------------------------------------
  final String name;
  AddressModel address = new AddressModel();

//  ---------------------------------- OPERATION METHODS -----------------------------------
  public void addStreet(String street) {
    this.address.setStreet(street);
  }

  public void addNumber(Integer number) {
    this.address.setNumber(number);
  }


// ----------------------------------- ACCESS CLASSES ---------------------------------------
  private class BaseData {

    public String getName() {
      return name;
    }
  }

  public class FirstStepModel extends BaseData {

  }

  public class SecondStep extends FirstStepModel {

    public AddressModel.SecondStep getAddress() {
      return address.new SecondStep();
    }
  }

  public class ThirtyStep extends FirstStepModel {

    public AddressModel.ThirtyStep getAddress() {
      return address.new ThirtyStep();
    }
  }
}
