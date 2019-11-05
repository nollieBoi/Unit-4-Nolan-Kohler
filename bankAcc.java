public class Bank{
  private int accNum;
  private String name;
  private String email;
  private String pass;
  private double money;
  public Bank(int newAccNum, String newName, String newEmail, String newPass, double newMoney){
    accNum = newAccNum;
    name = newName;
    email = newEmail;
    pass = newPass;
    money = newMoney;
  }
  public String toString(){
    String result = "";
    //result += "Account number: " + accNum + "\n";
    result += "Checking account: " + 
  }
  public int getAccNum(){
    return accNum;
  }
  public String getName(){
    return name;
  }
  public String getEmail(){
    return email;
  }
  public String getPass(){
    return pass;
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
