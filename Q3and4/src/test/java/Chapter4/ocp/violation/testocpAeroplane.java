package Chapter4.ocp.violation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.Config.ViolSpringConfig;

public class testocpAeroplane {
    private ocpAeroplane aeroplane;
    private ApplicationContext ctx;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(ViolSpringConfig.class);
        aeroplane = (ocpAeroplane)ctx.getBean("ocpviolAeroplane");
        aeroplane.setSerialNumber("AOE-124");
    }
    @Test
    public void testSerialNumber()
    {
        Assert.assertEquals("AOE-124",aeroplane.SerialNumber);
    }
    @After
    public void tearDown()
    {

    }
}