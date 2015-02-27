package Chapter4.plk.correction;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.Config.CorrSpringConfig;

public class testplkAeroplane {
    private plkAeroplane aeroplane;
    private ApplicationContext ctx;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(CorrSpringConfig.class);
        aeroplane = (plkAeroplane)ctx.getBean("plkcorrAeroplane");
    }
    @Test
    public void testEquipmentID()
    {
        Assert.assertEquals("123",aeroplane.getEquipmentID());
    }
    @After
    public void tearDown()
    {

    }
}