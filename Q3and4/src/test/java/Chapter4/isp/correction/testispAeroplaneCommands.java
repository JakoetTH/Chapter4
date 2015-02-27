package Chapter4.isp.correction;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.Config.CorrSpringConfig;

public class testispAeroplaneCommands {
    private ispAeroplaneCommands aeroplane;
    private ApplicationContext ctx;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(CorrSpringConfig.class);
        aeroplane = (ispAeroplaneCommands)ctx.getBean("ispcorrAeroplaneCommands");
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
