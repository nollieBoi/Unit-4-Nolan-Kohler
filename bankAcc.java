public class bankAcc{
  private String accNum;
  private String name;
  private double money;
  public Bank(String newAccNum, String newName, double newMoney){
    accNum = newAccNum;
    name = newName;
    money = newMoney;
  }
  public String toString(){
    String result = "";
    result += "Checking account: " +
  }
  public double getMoney(){
    return money;
  }
  public void setPass(String newPass){
    return pass;
  }
  public void deposit(double addMon){
    money += addMon;
  }
  public void withrdraw(double useMon){
    money -= useMon;
  }
}
