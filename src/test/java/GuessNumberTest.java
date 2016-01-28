/*
 * Created by asivolella <Andressa Sivolella> on 2016-01-28.
 */
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class GuessNumberTest {
    private GuessNumber guesser;

    @Before
    public void setUp(){
        this.guesser = new GuessNumber();
    }

    @Test
    public void shouldReceiveANumberGreaterThanZero(){
        int actualRandomNumber = this.guesser.getRandomNumber();
        assertTrue("Random number is not greater than zero", actualRandomNumber > 0);
    }

    @Test
    public void shouldReceiveANumberLowerThan1000(){
        int actualRandomNumber = this.guesser.getRandomNumber();
        assertTrue("Random number is not lower than 1000", actualRandomNumber < 1000);
    }
}
