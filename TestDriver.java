public class TestDriver {

  public static void main(String[] args) {

    // Instantiate the driver class and perform the following actions:
    Driver driver = new Driver();

    // Drive four times.
    driver.drive();
    driver.drive();
    driver.drive();
    driver.drive();

    // Use boosters once.
    driver.boost();

    // Refuel three times.
    driver.refuel();
    driver.refuel();
    driver.refuel();
  }
}
