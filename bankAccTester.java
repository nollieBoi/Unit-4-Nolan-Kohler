import java.util.Scanner;
public class bankAccTester{
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to Better than Joe's Bank Bank");
      System.out.println("Enter name: ");
      String initName = scan.nextLine();
      System.out.println("Enter pin: ");
      String initPin = scan.nextLine();
      double initMoney = 0.0;
      bankAcc Bank = new bankAcc("416813", initName, initPin, initMoney);
      System.out.println(Bank.toString());
      System.out.println("What would you like to do?");
      System.out.println("Type 'V' to View Account" +
      "\nType 'W' to Withdraw Money" +
      "\nType 'D' to Deposit Money" +
      "\nType 'A' to Add Interest" +
      "\nType 'E' to Exit App");
      Boolean runnen = true;
      while(runnen){
          String action = scan.nextLine();
          if(action.equals("V")){
              System.out.println(Bank.toString());
          }
          if(action.equals("W")){
              System.out.println("How much would you like to withdraw?");
              double withdrawMon = scan.nextDouble();
              Bank.withdraw(withdrawMon);
              System.out.println(Bank.toString());
          }
          if(action.equals("D")){
              System.out.println("How much would you like to deposit?");
              double depositMon = scan.nextDouble();
              Bank.deposit(depositMon);
              System.out.println(Bank.toString());
          }
          if(action.equals("A")){
              Bank.addInterest();
              System.out.println(Bank.toString());
          }
          if(action.equals("E")){
              runnen = false;
          }
      }
      System.out.println("Bye bye! <3");
  }
}
