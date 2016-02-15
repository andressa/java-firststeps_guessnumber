import java.util.Random;

/*
 * Created by asivolella on 2016-01-28.
 */
public class GuessNumber {
    private RandomNumber randomNumber;
    private int userGuess;
    private String message;
    private int trials;

    public GuessNumber(RandomNumber randomNumber){
        this.randomNumber = randomNumber;
    }

    public void setUserGuess(int userGuess) {
        this.userGuess = userGuess;
        this.trials ++;
    }

    public int getUserGuess() {
        return this.userGuess;
    }

    public void grabUserTips() throws MaiorQueException, MenorQueException {
        if (this.userGuess < this.randomNumber.getRandomNumber()) {
            throw new MenorQueException();
        } else {
            throw new MaiorQueException();
        }
    }

    public String checkUserGuess() throws MaiorQueException, MenorQueException{
        this.message = null;
        try{
            this.grabUserTips();
        } catch (MaiorQueException exception){
            this.message = "Your guess is greater than the raffled number =(";
        } catch (MenorQueException exception) {
            this.message = "Your guess is lower than the raffled number =(";
        }
        return this.message;
    }

    public int getTrials() {
        return this.trials;
    }
}
