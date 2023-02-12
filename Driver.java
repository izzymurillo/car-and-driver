// Create a driver class that extends the car class. 
public class Driver extends Car {

  // ======== METHODS ========
  // The driver can choose to drive, use boosters, or refuel.
  // Each method should print the action to the console, followed by the remaining
  // amount of gas.
  public void drive() {
    // Driving should decrease gas by 1
    gas -= 1;
    System.out.println("You drive the car.");
    getGas();
  }

  public void boost() {
    // Using boosters should decrease gas by 3
    gas -= 3;
    System.out.println("Boost it baby!");
    getGas();
  }

  public void refuel() {
    // Refueling should increase gas by 2
    gas += 2;
    System.out.println("Refueling the car.");
    getGas();
  }

}

// Example:

// Calling the drive method, should have the following output:

// You drive the car.
// Gas remaining: 9/10