package Chapter4.lsp.violation;

/**
 * Created by student on 2015/02/27.
 */
public class Helicopter implements Aircraft {
    @Override
    public String flyForwards()
    {
        return "The Helicopter is flying forwards.";
    }
    @Override
    public void flyBackwards()
    {
        System.out.println("The Helicopter is flying backwards.");
    }
}
