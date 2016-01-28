/*
 * Created by asivolella on 2016-01-28.
 */
public class MaiorQueException extends Exception{
    private String message = "Your guess is greater than the raffled number!";

    public MaiorQueException(){}

    @Override
    public String getMessage(){
        return message;
    }
}
