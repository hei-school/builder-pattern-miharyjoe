package org.example;

public class Director {
  public void constructSportsCar(Builder<? extends Product> builder) {
    builder.reset();
    builder.setSeats(2);
    builder.setEngine(Engine.SPORT);
    builder.setTripComputer(true);
    builder.setGPS(true);
  }

  public void constructSedanCar(Builder<? extends Product> builder) {
    builder.reset();
    builder.setSeats(4);
    builder.setEngine(Engine.SEDAN);
    builder.setTripComputer(false);
    builder.setGPS(true);
  }

  public void constructTruckCar(Builder<? extends Product> builder) {
    builder.reset();
    builder.setSeats(1);
    builder.setEngine(Engine.TRUCK);
    builder.setTripComputer(false);
    builder.setGPS(true);
  }

}
