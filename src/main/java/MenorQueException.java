/*
 * Created by asivolella <Andressa Sivolella> on 2016-01-28.
 */
public class MenorQueException extends Exception{
    private String message = "Your guess is lower than the raffled number!";

    public MenorQueException(){}

    @Override
    public String getMessage(){
        return message;
    }
}
