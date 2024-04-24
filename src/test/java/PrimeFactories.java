import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class PrimeFactories {

    @Test
    public void primeFactore() {
        assertThat(fatorial(1), is(empty()));
        assertThat(fatorial(2), is(contains(2)));
        assertThat(fatorial(3), is(contains(3)));
        assertThat(fatorial(4), is(contains(2, 2)));
        assertThat(fatorial(5), is(contains(5)));
        assertThat(fatorial(6), is(contains(2, 3)));
        assertThat(fatorial(7), is(contains(7)));
        assertThat(fatorial(8), is(contains(2, 2, 2)));
        assertThat(fatorial(9), is(contains(3, 3)));
        assertThat(fatorial(180), is(contains(2, 2, 3, 3, 5)));
    }

    private List<Integer> fatorial(int n) {
        ArrayList<Integer> fatorial = new ArrayList<>();

        for (int divisor = 2; n > 1; divisor++) {
            for (; n % divisor == 0; n /= divisor) {
                fatorial.add(divisor);
            }
        }

        return fatorial;
    }
}
