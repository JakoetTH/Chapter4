package Chapter4.srp.violation;

/**
 * Created by student on 2015/02/27.
 */
public class srpAeroplane implements srpAircraft {
    @Override
    public String Aeroplane()
    {
        return "This is an aeroplane.";
    }
    @Override
    public String Helicopter() throws UnsupportedOperationException
    {
        return "";
    }
}
