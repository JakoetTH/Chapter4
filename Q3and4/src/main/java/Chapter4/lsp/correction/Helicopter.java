package Chapter4.lsp.correction;

/**
 * Created by student on 2015/02/27.
 */
public class Helicopter implements Aircraft {
    @Override
    public String flyForwards()
    {
        return "The Helicopter is flying forwards." ;
    }
    public String flyBackwards()
    {
        return "The Helicopter is flying backwards." ;
    }
}
