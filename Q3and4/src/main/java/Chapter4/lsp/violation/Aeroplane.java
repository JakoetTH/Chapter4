package Chapter4.lsp.violation;

/**
 * Created by student on 2015/02/27.
 */
public class Aeroplane implements Aircraft {
    @Override
    public String flyForwards()
    {
        return "The Aeroplane is flying forwards.";
    }
    @Override
    public void flyBackwards()
    {
        throw new UnsupportedOperationException();
    }
}
