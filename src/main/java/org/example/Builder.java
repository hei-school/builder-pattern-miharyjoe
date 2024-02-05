package org.example;

public interface Builder<T> {
  void reset();
  void setSeats(int seats);
  void setEngine(Engine engine);
  void setTripComputer(boolean hasTripComputer);
  void setGPS(boolean hasGPS);
  T getProduct();
}
