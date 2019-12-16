public class DieComputer {
    Die dC1 = new Die();
    Die dC2 = new Die();
    private int score;
    private int roundScore = 0;
    private Boolean pass = false;

    public DieComputer(int newRoundScore, int newScore){
        score = newScore;
        roundScore = newRoundScore;
    }

    public void play() {
        while (pass == false) {
            if (roundScore < 20) {
                dC1.roll();
                dC2.roll();
                System.out.println("Computer die 1 = " + dC1.getFace());
                System.out.println("Computer die 2 = " + dC2.getFace());
                if (dC1.getFace() == 1 && dC2.getFace() == 1) {
                    score = 0;
                    roundScore = 0;
                    System.out.println("Computer round score: " + roundScore);
                    pass = true;
                } else if (dC1.getFace() == 1 || dC2.getFace() == 1) {
                    roundScore = 0;
                    System.out.println("Computer round score: " + roundScore);
                    pass = true;
                } else {
                    roundScore += (dC1.getFace() + dC2.getFace());
                    System.out.println("Computer round score: " + roundScore);
                }
            } else if (roundScore >= 20) {
                pass = true;
            }
        }
        if (pass) {
            score += roundScore;
            System.out.println("Computer Score is: " + score);
        }
        pass = false;
    }

    public int getScore() {
        return score;
    }
}
