package org.example;


public class CarBuilder implements Builder<Car> {
  private Car car;

  public CarBuilder() {
    this.reset();
  }

  @Override
  public void reset() {
    this.car = new Car();
  }

  @Override
  public void setSeats(int seats) {
    car.setNumOfSeats(seats);
  }

  @Override
  public void setEngine(Engine engine) {
    car.setEngine(engine);
  }

  @Override
  public void setTripComputer(boolean hasTripComputer) {
    car.setHasTripComputer(hasTripComputer);
  }

  @Override
  public void setGPS(boolean hasGPS) {
    car.setHasGPS(hasGPS);
  }

  @Override
  public Car getProduct() {
    Car result = this.car;
    this.reset();
    return result;
  }
}
