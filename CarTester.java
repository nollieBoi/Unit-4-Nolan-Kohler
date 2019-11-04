import java.util.Scanner;

public class CarTester{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String make = "";
    String model = "";
    double mpg;
    double tank;
    int miles;
    final double MILES_DRIVEN = 132.8;
    final double ADDED_FUEL = 2.5;

    System.out.println("Welcome to Joe Car simulator");
    System.out.println("What is the make of your car?");
    make = scan.nextLine();
    System.out.println("What is the model of your car?");
    model = scan.nextLine();
    System.out.println("How many mpg does your car get? (include decimal)");
    mpg = scan.nextDouble();
    System.out.println("What is the size of your tank? (include decimal)");
    tank = scan.nextDouble();
    System.out.println("How many miles does your car have?");
    miles = scan.nextInt();

    Car joeCar = new Car(make, model, mpg, tank, miles);

    System.out.println(joeCar);

    joeCar.drive(MILES_DRIVEN); //drive car for 132.8 miles

    System.out.println("Drove " + MILES_DRIVEN + " miles: " + "\n" + joeCar);

    joeCar.addFuel(ADDED_FUEL); //add 2.5 gallons of fuel to carTankSize

    System.out.println("Added " + ADDED_FUEL + " gal of fuel" + "\n" + joeCar);
  }
}
