public class CarTester{
  public static void main(String[] args){
    Car joeCar = new Car("BMW", "330ci", 21.5, 17.0);

    System.out.println(joeCar);

    joeCar.drive(13.8); //drive car for 13.8 miles

    System.out.println("Drove 13.8 miles: " + joeCar);

    joeCar.addFuel(2.5); //add 2.5 gallons of fuel to carTankSize

    System.out.println("Added 2.5 gallons of fuel: " + joeCar);
  }
}
