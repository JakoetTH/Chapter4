package Chapter4.lsp.violation;

/**
 * Created by student on 2015/02/27.
 */
public class Aeroplane implements Aircraft {
    public String flyForwards()
    {
        return "The Aeroplane is flying forwards.";
    }
    public void flyBackwards()
    {
        throw new UnsupportedOperationException();
    }
}
