/*
 * Created by asivolella <Andressa Sivolella> on 2016-01-28.
 */
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GuessNumberTest {
    private GuessNumber guesser;
    private int userGuess = 936;

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

    @Test
    public void variableUserGuessShouldNotBeNull(){
        this.guesser.setUserGuess(this.userGuess);
        int actualUserGuess = this.guesser.getUserGuess();
        assertNotNull("Variable userGuess should not be null", actualUserGuess);
    }

    @Test
    public void guesserUserGuessShouldBeEqualToThisUserGuess(){
        this.guesser.setUserGuess(this.userGuess);
        int expectedUserGuess = this.userGuess;
        int actualUserGuess = this.guesser.getUserGuess();

        assertEquals("GuessUser.userGuess is not equal to this.userGuess", expectedUserGuess, actualUserGuess);
    }
}