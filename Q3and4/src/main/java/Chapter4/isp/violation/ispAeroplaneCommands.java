package Chapter4.isp.violation;

/**
 * Created by student on 2015/02/27.
 */
public class ispAeroplaneCommands implements ispAircraft {
    @Override
    public String Fly()
    {
        return "This aeroplane is flying.";
    }
    @Override
    public String Model() throws UnsupportedOperationException
    {
        return "";
    }
}
