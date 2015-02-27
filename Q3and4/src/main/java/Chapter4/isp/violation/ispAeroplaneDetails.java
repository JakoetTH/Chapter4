package Chapter4.isp.violation;

/**
 * Created by student on 2015/02/27.
 */
public class ispAeroplaneDetails implements ispAircraft {
    @Override
    public String Model()
    {
        return "This is a Boeing-474";
    }
    @Override
    public String Fly() throws UnsupportedOperationException
    {
        return "";
    }

}
