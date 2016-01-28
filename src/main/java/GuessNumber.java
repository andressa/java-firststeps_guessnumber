/*
 * Created by asivolella on 2016-01-28.
 */
public class GuessNumber {
    private int randomNumber;
    private int userGuess;

    public GuessNumber(){
        this.randomNumber = (int)(Math.random() * 1000);
    }

    public int getRandomNumber() {
        return this.randomNumber;
    }

    public void setUserGuess(int userGuess) {
        this.userGuess = userGuess;
    }

    public int getUserGuess() {
        return userGuess;
    }
}
