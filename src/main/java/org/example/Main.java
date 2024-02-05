package org.example;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();
    CarBuilder carBuilder = new CarBuilder();
    CarManualBuilder manualBuilder = new CarManualBuilder();

    // Construct a sports car
    director.constructSportsCar(carBuilder);
    Car car = carBuilder.getProduct();
    System.out.println("--- Sports Car Details ---");
    System.out.println("Engine: " + car.getEngine());
    System.out.println("Has Trip Computer: " + car.getHasTripComputer());
    System.out.println("Has GPS: " + car.getHasGPS());

    // Print the sports car manual sections
    director.constructSportsCar(manualBuilder);
    Manual manual = manualBuilder.getProduct();
    String[] manualSections = manual.getSections();
    System.out.println("--- Sports Car Manual Sections ---");
    for (String section : manualSections) {
      System.out.println(section);
    }
  }
}