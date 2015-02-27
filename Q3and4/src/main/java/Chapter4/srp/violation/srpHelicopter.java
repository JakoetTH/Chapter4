package Chapter4.srp.violation;

/**
 * Created by student on 2015/02/27.
 */
public class srpHelicopter implements srpAircraft {
    @Override
    public String Helicopter()
    {
        return "This is a helicopter.";
    }
    @Override
    public String Aeroplane() throws UnsupportedOperationException
    {
        return "";
    }
}
