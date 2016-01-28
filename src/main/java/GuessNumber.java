/*
 * Created by asivolella on 2016-01-28.
 */
public class GuessNumber {
    int randomNumber;

    public GuessNumber(){
        this.randomNumber = (int)(Math.random() * 1000);
    }

    public int getRandomNumber() {
        return this.randomNumber;
    }
}
