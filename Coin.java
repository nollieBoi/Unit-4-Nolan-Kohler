/*
  This is the Coin class
  It is the blueprint for how to make a coin object
*/
public class Coin{
  //These are the declarations for the attributes of a Coin
  private int face;

  private final int HEADS = 0;//contants defining heads and tails
  private final int TAILS = 1;

  /*
  The coin constructor that defines what happens when a coin object is made.
  When a new is made it gets flipped
  */
  public Coin(){
    flip();
  }

  /*
  This is the section of the class containing the methods of a Coin

  /*
  The accessor method for the face variable (a getter)
  */
  public int getFace(){
    return face;
  }

  /*
  The mutator/modifier method for the face variable (a setter)
  **setter always have return type of void**
  */
  public void setFace(int newFace){
    face = newFace;
  }


  /*
  The flip method assigns a randomly chosen calue to the face of the coin
  */
  public void flip(){
    face = (int)(Math.random() * 2);
  }

  /*
  The isHeads methods tells us if the coin's face is a heads or not
  */
  public boolean isHeads(){
    return (face == HEADS);
  }

  /*
  Prints out information about the current state of the coin
  */
  public String toString(){
    String result = "";
    if(face == HEADS){
      result = "HEADS";
    }
    else{
      result = "TAILS";
    }
    return result;
  }
}
