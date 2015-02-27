package Chapter4.lsp.correction;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.Config.CorrSpringConfig;

public class testAeroplane {
    private Aeroplane aeroplane;
    private ApplicationContext ctx;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(CorrSpringConfig.class);
        aeroplane = (Aeroplane)ctx.getBean("lspcorrAeroplane");
    }
    @Test
    public void testFlyForwards()
    {
        Assert.assertEquals("The Aeroplane is flying forwards.",aeroplane.flyForwards());
    }
    @After
    public void tearDown()
    {

    }
}
