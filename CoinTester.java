/*
Creates instances of the Coin class and tests their attributes and behavrios
*/

public class CoinTester{
  public static void main(String[] args){
    Coin myCoin = new Coin();
    Coin yourCoin = new Coin();
    Coin testCoin = new Coin();
    int numHeads = 0;

    System.out.println("My coin: " + myCoin);
    System.out.println("Your coin: " + yourCoin);

    for(int i = 0; i < 10; i++){
      if(testCoin.isHeads() == true){
        numHeads++;
      }
    }
    System.out.println("Number of heads: " + numHeads);
  }
}
