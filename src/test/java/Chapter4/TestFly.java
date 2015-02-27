package Chapter4;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.Config.SpringConfig;
import Chapter4.Impl.Helicopter;

public class TestFly {
    private Aircraft aircraft;
    private ApplicationContext ctx;

    @Before
    public void setUp ()
    {
        ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        //Polymorphism
        aircraft = (Helicopter)ctx.getBean("HelicopterBean");
    }
    @Test
    public void testFlyHelicopter()
    {
        Assert.assertEquals("Helicopter is now flying.",aircraft.fly());
    }
    @After
    public void tearDown()
    {

    }

}
