import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BuilderImplTest {
  @Test
  public void testCarSportBuilder() {
    Director director = new Director();
    CarBuilder carBuilder = new CarBuilder();
    CarManualBuilder manualBuilder = new CarManualBuilder();

    director.constructSportsCar(carBuilder);
    Car car = carBuilder.getProduct();

    assertEquals(Engine.SPORT, car.getEngine());
    assertEquals(true, car.getHasTripComputer());
    assertEquals(true, car.getHasGPS());

    director.constructSportsCar(manualBuilder);
    Manual manual = manualBuilder.getProduct();

    String[] manualSections = manual.getSections();
    assertTrue(manualSections.length >= 3);
    assertTrue(manualSections[0].startsWith("Number of seats: 2"));
    assertTrue(manualSections[1].startsWith("Two-door coupé designed for performance."));
    assertTrue(manualSections[2].startsWith("This vehicle comes equipped with a trip computer."));
  }

  @Test
  public void testCarSedanBuilder() {
    Director director = new Director();
    CarBuilder carBuilder = new CarBuilder();
    CarManualBuilder manualBuilder = new CarManualBuilder();

    director.constructSedanCar(carBuilder);
    Car car = carBuilder.getProduct();

    assertEquals(Engine.SEDAN, car.getEngine());
    assertEquals(false, car.getHasTripComputer());
    assertEquals(true, car.getHasGPS());

    director.constructSedanCar(manualBuilder);
    Manual manual = manualBuilder.getProduct();

    String[] manualSections = manual.getSections();
    assertTrue(manualSections.length >= 3);
    assertTrue(manualSections[0].startsWith("Number of seats: 4"));
    assertTrue(manualSections[1].startsWith("Standard four-door sedan."));
    assertTrue(manualSections[2].startsWith("No trip computer is installed on this vehicle."));
  }

  @Test
  public void testCarTruckBuilder() {
    Director director = new Director();
    CarBuilder carBuilder = new CarBuilder();
    CarManualBuilder manualBuilder = new CarManualBuilder();

    director.constructTruckCar(carBuilder);
    Car car = carBuilder.getProduct();

    assertEquals(Engine.TRUCK, car.getEngine());
    assertEquals(false, car.getHasTripComputer());
    assertEquals(true, car.getHasGPS());

    director.constructTruckCar(manualBuilder);
    Manual manual = manualBuilder.getProduct();

    String[] manualSections = manual.getSections();
    assertTrue(manualSections.length >= 3);
    assertTrue(manualSections[0].startsWith("Number of seats: 1"));
    assertTrue(manualSections[1].startsWith("Heavy duty truck capable of haulage tasks."));
    assertTrue(manualSections[2].startsWith("No trip computer is installed on this vehicle."));
  }
}
