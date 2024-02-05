package org.example;

public class Car extends Product {
  private Engine engine;
  private int numOfSeats;
  private boolean hasTripComputer;
  private boolean hasGPS;

  public Engine getEngine() {
    return this.engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public int getNumOfSeats() {
    return this.numOfSeats;
  }

  public void setNumOfSeats(int numOfSeats) {
    this.numOfSeats = numOfSeats;
  }

  public boolean getHasTripComputer() {
    return this.hasTripComputer;
  }

  public void setHasTripComputer(boolean hasTripComputer) {
    this.hasTripComputer = hasTripComputer;
  }

  public boolean getHasGPS() {
    return this.hasGPS;
  }

  public void setHasGPS(boolean hasGPS) {
    this.hasGPS = hasGPS;
  }
}