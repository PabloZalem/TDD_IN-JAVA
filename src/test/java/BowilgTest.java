import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowilgTest {

    Game g = new Game();

    public void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.rolls(pins);
        }
    }

    @Test
    public void gutterGame() {
        rollMany(0, 20);
    }

    @Test
    public void allOnes() {
        rollMany(1, 20);
    }

    @Test
    public void spare() {
        rollMany(2, 5);
        g.rolls(7);
        rollMany(17, 0);
        assertEquals(24, g.score());
    }

    @Test
    public void strike() {
        g.rolls(10);
        g.rolls(2);
        g.rolls(3);
        rollMany(16, 0);
        assertEquals(20, g.score());
    }

    @Test
    public void perfectGame() {
        rollMany(12, 10);
        assertEquals(300, g.score());
    }
}
