package Chapter4.lsp.violation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.Config.ViolSpringConfig;

public class testAeroplane {
    private Aeroplane aeroplane;
    private ApplicationContext ctx;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(ViolSpringConfig.class);
        aeroplane = (Aeroplane)ctx.getBean("lspviolAeroplane");
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

