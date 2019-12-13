import java.util.Scanner;

public class DieTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the dice simulator");
        Scanner scan = new Scanner(System.in);
        DieComputer comp = new DieComputer(0, 0);
        Die d1 = new Die();
        Die d2 = new Die();
        int score = 0;
        int roundScore = 0;
        Boolean pass = false;
        String whateveryousay = "";
        while (pass == false) {
            System.out.println("Enter r to roll or p to pass");
            whateveryousay = scan.nextLine();
            if (whateveryousay.equals("r")) {
                d1.roll();
                d2.roll();
                System.out.println("Die 1 = " + d1.getFace());
                System.out.println("Die 2 = " + d2.getFace());
                if (d1.getFace() == 1 && d2.getFace() == 1) {
                    score = 0;
                    roundScore = 0;
                    System.out.println("Round score: " + roundScore);
                    pass = true;
                } else if (d1.getFace() == 1 || d2.getFace() == 1) {
                    roundScore = 0;
                    System.out.println("Round score: " + roundScore);
                    pass = true;
                } else {
                    roundScore += (d1.getFace() + d2.getFace());
                    System.out.println("Round score: " + roundScore);
                }
            } else if (whateveryousay.equals("p")) {
                pass = true;
            } else {
                System.out.println("Please enter r or p.");
            }
        }
        if(pass){
            score += roundScore;
            System.out.println("Score is: " + score);
            //comp.play();
        }
    }
}
