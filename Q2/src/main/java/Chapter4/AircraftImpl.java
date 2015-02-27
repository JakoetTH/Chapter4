package Chapter4;

/**
 * Created by student on 2015/02/27.
 */
public class AircraftImpl implements Aircraft {
    @Override
    public String fly() {  return "Helicopter is now flying.";}
    @Override
    public String land() {  return "Helicopter is now landing.";}
}
