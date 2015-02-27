package Chapter4.lsp.violation;


import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.Config.ViolSpringConfig;

public class testHelicopter {
    private Helicopter helicopter;
    private ApplicationContext ctx;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(ViolSpringConfig.class);
        helicopter = (Helicopter)ctx.getBean("lspviolHelicopter");
    }
    @Test
    public void testFlyForwards()
    {
        Assert.assertEquals("The Helicopter is flying forwards.", helicopter.flyForwards());
    }
    @After
    public void tearDown()
    {

    }
}


