import java.util.Scanner;

public class bankAccTester{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String name = "User";
    String email = "";
    String password = "";
    int choice = "";
    System.out.println("Welcome to Better Than JoeBank!");
    System.out.println("Please login....... >_< (email and then password)");
    email = scan.nextLine();
    password = scan.nextLine();

    if(email.equals(email) && password.equals(password)){
      System.out.println("\n" + "Welcome " + name + "!" + "\n");
      System.out.println("What would you like to do?" + "\n" +
      "1. Change name" + "\n" + "2. Check checkings and savings" + "\n"
      + "3. Deposit money into savings" + "\n" +
      "4. Withdraw money from savings" + "\n" +
      "5. Transfer from savings to checkings" + "\n" + "6. Sign out");
      choice = scan.nextInt();
    }

    if(choice = 1){
      System.out.println("What would you like to change your name to?");
      name = scan.nextLine();
    }

    if(choice = 2){

    }

    if(choice = 3){

    }

    if(choice = 4){

    }

    if(choice = 5){

    }

    if(choice = 6){

    }
  }
}
