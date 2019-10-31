public class Car{
  private String make;
  private String model;
  private double mpg;
  private double tankSize;
  private double amtFuel;

  /*
  Constructor for the car. Initializes the instance variables for the car
  */

  public Car(String carMake, String carModel, double carMpg, double carTankSize){
    make = carMake;
    model = carModel;
    mpg = carMpg;
    tankSize = carTankSize;
    amtFuel = tankSize;
  }

  public String toString(){
    String result = "";
    result += "Make: " + make + "\n";
    result += "Model: " + model + "\n";
    result += "MPG: " + mpg + "\n";
    result += "Tank size: " + tankSize + "\n";
    result += "Amount of fuel: " + amtFuel + "\n";
    return result;
  }

  public String getmake(){
    return make;
  }

  public String getmodel(){
    return model;
  }

  public double getmpg(){
    return mpg;
  }

  public double gettankSize(){
    return tankSize;
  }

  public double getamtFuel(){
    return amtFuel;
  }

  public void drive(double miles){
    if(miles <= (mpg * amtFuel)){
      fuel = miles/mpg;
    }else
      fuel = 0.0;
  }

  public void refuel(double gal){
    if(fuel + gal <= tank){
      fuel += gal;
    }else
      fuel = tank;
  }
}
