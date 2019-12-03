public class bankAcc{
  private String accNum;
  private String name;
  private String pin;
  private double money;
  public bankAcc(String newAccNum, String newName, String newPin, double newMoney){
    accNum = newAccNum;
    name = newName;
    pin = newPin;
    money = newMoney;
  }
  public String toString(){
    String result = "";
    result += "Account number: " + accNum + "\n";
    result += " Name: " + name + "\n";
    result += " Pin number: " + pin + "\n";
    result += " Money in the ish: " + money + "\n";
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
    public void withdraw(double useMon){
    money -= useMon;
  }
  public void addInterest(){
    double interest = 1.02;
    money = money * interest;
  }
}
