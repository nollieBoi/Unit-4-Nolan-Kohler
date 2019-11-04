public class Car{
  private String make;
  private String model;
  private double mpg;
  private double tankSize;
  private double amtFuel;
  private double miles;
  private final double EMPTY = 0.0;

  /*
  Constructor for the car. Initializes the instance variables for the car
  */

  public Car(String carMake, String carModel, double carMpg, double carTankSize, int carMiles){
    make = carMake;
    model = carModel;
    mpg = carMpg;
    tankSize = carTankSize;
    amtFuel = tankSize;
    miles = carMiles;
  }

  public String toString(){
    String result = "";
    result += "Make: " + make + "\n";
    result += "Model: " + model + "\n";
    result += "MPG: " + mpg + "\n";
    result += "Tank size: " + tankSize + "\n";
    result += "Amount of fuel: " + amtFuel + "\n";
    result += "Miles on your car: " + miles + "\n";
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

  public double getMiles(){
    return miles;
  }

  public void drive(double dist){
    if(dist <= (mpg * amtFuel)){
      amtFuel -= dist/mpg;
      miles += dist;
    }else
      amtFuel = EMPTY;
      miles += dist;
  }

  public void addFuel(double gal){
    if(amtFuel + gal <= tankSize){
      amtFuel += gal;
    }else
      amtFuel = tankSize;
  }
}
