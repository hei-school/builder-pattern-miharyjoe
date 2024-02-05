# Vehicle Builder Pattern Demonstration
This repository demonstrates the usage of the Builder Design Pattern in Java utilizing a simple yet practical scenario involving vehicle construction. Three main entities participate in this exercise—the Director managing the overall construction flow, the Concrete Builders handling the stepwise fabrication processes, and the Products themselves, namely Car and Manual.

## Project Components
### Abstract Classes / Interfaces
* Product

An empty marker interface serving as a placeholder indicating shared ancestry amongst the Car and Manual entities.

* Builder<T>

Defines a standardized protocol followed by all builders, enabling consistent interaction among them regardless of the underlying product.

* Enum Types Engine

Represents different kinds of automotive engines. Used throughout the application to specify distinct engines associated with varied vehicles.

### Concrete Products
* Car

A representation of a motor vehicle featuring modifiable parameters such as engine type, passenger capacity, trip computers, and Global Positioning Systems (GPS).

* Manual

Accompanying material for the Car entity, detailing technical specifications, operating procedures, and maintenance guidelines tailored specifically towards the created Car instance.

* Concrete Builders & Directors :

##### CarBuilder
Implements the generalized Builder contract to erect a Car object incrementally, exposing fluent API methods to initialize its constituents.

##### CarManualBuilder
Parallels the CarBuilder counterpart, concentrating exclusively on compiling instructional literature pertinent to the Car product.

##### Director
Coordinates and synchronizes interactions between various builders to establish coherent construction flows, encapsulating intricate sequences that ultimately yield fully formed Cars accompanied by detailed Manuals.

## Usage Instructions
To utilize this project, first import the source files into your favorite Java Integrated Development Environment (IDE) and compile them successfully.
    
```bash
        git clone https://github.com/hei-school/builder-pattern-miharyjoe
   ``` 

Subsequently, leverage the enclosed JUnit test suite located in BuilderImplTest.java to examine functionalities offered by the provided APIs. Run the test suite and observe the console output displaying successful execution logs, ensuring flawless operation of the Builder Design Pattern demonstrated herein.

### Or 
You can see directly in the [Github Action](https://github.com/hei-school/builder-pattern-miharyjoe/actions) the result of the test of the implementation , it should show 3 test passed for the SportCar, SedanCar, TruckCar



Feel encouraged to employ this blueprint as inspiration for devising similar applications necessitating sophisticated object composition techniques leveraging the power of the Builder Design Pattern. Happy coding! 💻🚀

[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/eYTuOlgZ)
