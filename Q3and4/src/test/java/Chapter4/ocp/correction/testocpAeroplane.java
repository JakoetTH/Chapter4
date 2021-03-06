package Chapter4.ocp.correction;


import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.Config.CorrSpringConfig;

public class testocpAeroplane {
    private ocpAeroplane aeroplane;
    private ApplicationContext ctx;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(CorrSpringConfig.class);
        aeroplane = (ocpAeroplane)ctx.getBean("ocpcorrAeroplane");
    }
    @Test
    public void testSerialNumber()
    {
        Assert.assertEquals("AOE-123",aeroplane.SerialNumber());
    }
    @After
    public void tearDown()
    {

    }
}
