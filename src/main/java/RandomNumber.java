/*
 * Created by asivolella on 2016-02-15
 */
public class RandomNumber {
    private int randomNumber; // mock!

    public RandomNumber(){
        this.randomNumber = (int) (Math.random() * 1000);
    }

    public int getRandomNumber(){ // mock!
        return this.randomNumber;
    }
}
