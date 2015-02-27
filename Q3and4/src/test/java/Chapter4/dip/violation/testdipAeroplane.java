package Chapter4.dip.violation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.Config.ViolSpringConfig;

public class testdipAeroplane {
    private dipAeroplane aeroplane;
    private ApplicationContext ctx;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(ViolSpringConfig.class);
        aeroplane = (dipAeroplane)ctx.getBean("dipviolAeroplane");
    }
    @Test
    public void testFly()
    {
        Assert.assertEquals("This aeroplane is flying.",aeroplane.Fly());
    }
    @After
    public void tearDown()
    {

    }
}