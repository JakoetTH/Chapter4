package Chapter4.plk.violation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Chapter4.Config.ViolSpringConfig;

public class testplkAeroplane {
    private plkAeroplane aeroplane;
    private ApplicationContext ctx;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(ViolSpringConfig.class);
        aeroplane = (plkAeroplane)ctx.getBean("plkviolAeroplane");
    }
    @Test
    public void testEquipmentID()
    {
        Assert.assertEquals("123",aeroplane.equipment.getEquipmentID());
    }
    @After
    public void tearDown()
    {

    }
}