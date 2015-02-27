package Chapter4.srp.violation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.Config.ViolSpringConfig;

public class testsrpAeroplane {
    private srpAeroplane aeroplane;
    private ApplicationContext ctx;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(ViolSpringConfig.class);
        aeroplane = (srpAeroplane)ctx.getBean("srpviolAeroplane");
    }
    @Test
    public void testAeroplane()
    {
        Assert.assertEquals("This is an aeroplane.",aeroplane.Aeroplane());
    }
    @After
    public void tearDown()
    {

    }
}