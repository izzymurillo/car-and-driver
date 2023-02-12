// Create a car class that has a gas attribute. 
public class Car {
  public int gas;

  // ====== CONSTRUCTOR ======
  // Each car should start with a gas level of 10.
  public Car() {
    this.gas = 10;
  }

  // Create a method that displays the amount of gas remaining in the car.
  // (Getter for gas)
  public int getGas() {
    System.out.println("Gas remaining: " + this.gas + "/10");
    return this.gas;
  }
}
