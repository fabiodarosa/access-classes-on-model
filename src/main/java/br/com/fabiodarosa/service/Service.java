package br.com.fabiodarosa.service;

import br.com.fabiodarosa.models.ModelClass;
import br.com.fabiodarosa.models.ModelClass.FirstStepModel;
import br.com.fabiodarosa.models.ModelClass.SecondStep;
import br.com.fabiodarosa.models.ModelClass.ThirtyStep;

public class Service {

  public static void main(String[] args) {
    operationMediator("Arthur");
    System.out.println("------------------------");
    operationMediator("Carla");
  }

  public static void operationMediator(String name) {
    ModelClass modelClass = new ModelClass(name);

    String fistStepResult = firstStep(modelClass.new FirstStepModel());
    modelClass.addStreet(fistStepResult);

    Integer number = secondStep(modelClass.new SecondStep());
    modelClass.addNumber(number);

    thirtyStep(modelClass.new ThirtyStep());
  }

  public static String firstStep(FirstStepModel model) {
    if (model.getName().startsWith("A")) {
      return "Av. com nome A";
    } else {
      return "Av com outros nomes";
    }
  }


  public static Integer secondStep(SecondStep model) {
    if (model.getAddress().getStreet().equals("Av. com nome A")) {
      return 1;
    } else {
      return 2;
    }
  }


  public static void thirtyStep(ThirtyStep model) {
    System.out.println(model.getName());
    System.out.println(model.getAddress().getStreet());
    System.out.println(model.getAddress().getNumber());
  }

}
