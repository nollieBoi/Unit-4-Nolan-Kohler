/*
Creates instances of the Coin class and tests their attributes and behavrios
*/
import java.util.Scanner;

public class CoinTester{
  public static void main(String[] args){
    //Coin myCoin = new Coin();
    //Coin yourCoin = new Coin();
    Scanner scan = new Scanner(System.in);
    Coin testCoin = new Coin();
    System.out.println("How many times do you wanna flip a coin?");
    final int FLIPS = scan.nextInt();
    int numHeads = 0;
    int numTails = 0;

    //System.out.println("My coin: " + myCoin);
    //System.out.println("Your coin: " + yourCoin);

    for(int i = 0; i < FLIPS; i++){
      testCoin.flip();
      System.out.println("Coin flip result: " + testCoin);
      if(testCoin.isHeads()){
        numHeads++;
      }else{
        numTails++;
      }
    }
    System.out.println("Number of heads: " + numHeads);
    System.out.println("Number of tails: " + numTails);
    System.out.println("% of heads is: " + (numHeads / (double)FLIPS * 100));
  }
}
