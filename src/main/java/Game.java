public class Game {

    private int score = 0;
    private int[] rolls = new int[21];
    private int currentRolls = 0;

    public void rolls(int pins) {
        rolls[currentRolls++] += pins;
    }

    public int score() {
        int i = 0;

        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(i)) {
                score += 10 + rolls[i + 1] + rolls[i +2];
                i++;
            }else if (isSpare(i)) {
                score += 10 + rolls[i + 2];
                i += 2;
            } else  {
                score += rolls[i] + rolls[i + 1];
                i += 2;
            }
        }

        return score;
    }

    private boolean isSpare(int i) {
        return rolls[i] + rolls[i + 1] == 10;
    }

    private boolean isStrike(int i) {
        return rolls[i] == 10;
    }
}
