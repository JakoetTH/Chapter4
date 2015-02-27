package Chapter4.isp.violation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.Config.ViolSpringConfig;

public class testispAeroplaneCommands {
    private ispAeroplaneCommands aeroplane;
    private ApplicationContext ctx;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(ViolSpringConfig.class);
        aeroplane = (ispAeroplaneCommands)ctx.getBean("ispviolAeroplaneCommands");
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