public class bankAcc{
  private String accNum;
  private String name;
  private String pin;
  private double money;
  public Bank(String newAccNum, String newName, String newPin, double newMoney){
    accNum = newAccNum;
    name = newName;
    pin = newPin;
    money = newMoney;
  }
  public String toString(){
    String result = "";
    result += "Account number: " + accNum;
    result += "Name: " + name;
    result += "Pin number: " + pin;
    result += "Money in the ish: " + money;
    return result;

  }

    public String getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public String getAccNum() {
        return accNum;
    }

    public double getMoney() {
        return money;
    }

    public void deposit(double addMon){
    money += addMon;
  }
  public void withrdraw(double useMon){
    money -= useMon;
  }
}
