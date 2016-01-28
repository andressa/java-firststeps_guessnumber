/*
 * Created by asivolella on 2016-01-28.
 */
public class GuessNumber {
    private int randomNumber;
    private int userGuess;
    private String message;
    private int trials;

    public GuessNumber(){
        this.randomNumber = (int) (Math.random() * 1000);
    }

    public GuessNumber(boolean fake){
        if (!fake) {
            this.randomNumber = (int) (Math.random() * 1000);
        } else{
            this.randomNumber = 500;
        }

    }

    public int getRandomNumber() {
        return this.randomNumber;
    }

    public void setUserGuess(int userGuess) {
        this.userGuess = userGuess;
        this.trials ++;
    }

    public int getUserGuess() {
        return this.userGuess;
    }

    private void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String checkUserGuess() {
        this.message = null;
        if (this.userGuess < this.randomNumber){
            this.message = "Your guess is lower than the raffled number =(";
        }else{
            this.message = "Your guess is greater than the raffled number =(";
        }
        return message;
    }

    public int getTrials() {
        return this.trials;
    }
}
