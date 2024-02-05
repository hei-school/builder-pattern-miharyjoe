package org.example;

public class CarManualBuilder implements Builder<Manual> {
  private Manual manual;

  public CarManualBuilder() {
    this.reset();
  }

  @Override
  public void reset() {
    this.manual = new Manual();
  }

  @Override
  public void setSeats(int seats) {
    manual.addSection("Number of seats: " + seats);
  }

  @Override
  public void setEngine(Engine engine) {
    switch (engine) {
      case SEDAN:
        manual.addSection("Standard four-door sedan.");
        break;
      case SPORT:
        manual.addSection("Two-door coupé designed for performance.");
        break;
      case TRUCK:
        manual.addSection("Heavy duty truck capable of haulage tasks.");
        break;
      default:
        throw new IllegalArgumentException("Unknown engine type encountered.");
    }
  }

  @Override
  public void setTripComputer(boolean hasTripComputer) {
    if (hasTripComputer) {
      manual.addSection("This vehicle comes equipped with a trip computer.");
    } else {
      manual.addSection("No trip computer is installed on this vehicle.");
    }
  }

  @Override
  public void setGPS(boolean hasGPS) {
    if (hasGPS) {
      manual.addSection("This vehicle has a factory-installed navigation system.");
    } else {
      manual.addSection("There is no navigation system pre-installed.");
    }
  }

  @Override
  public Manual getProduct() {
    Manual result = this.manual;
    this.reset();
    return result;
  }
}