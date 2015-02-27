package Chapter4.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import Chapter4.lsp.correction.Aeroplane;
import Chapter4.lsp.correction.Helicopter;
import Chapter4.ocp.correction.ocpAeroplane;
import Chapter4.srp.correction.srpAeroplaneImpl;
import Chapter4.srp.correction.srpHelicopterImpl;
import Chapter4.dip.correction.dipAeroplane;
import Chapter4.isp.correction.ispAeroplaneCommands;
import Chapter4.isp.correction.ispAeroplaneDetails;

@Configuration
public class CorrSpringConfig {
    @Bean(name="lspcorrAeroplane")
    public Aeroplane getlspAeroplane()
    {
        return new Aeroplane();
    }
    @Bean(name="lspcorrHelicopter")
    public Helicopter getlspHelicopter()
    {
        return new Helicopter();
    }
    @Bean(name="ocpcorrAeroplane")
    public ocpAeroplane getocpAeroplane()
    {
        return new ocpAeroplane();
    }
    @Bean(name="srpcorrAeroplane")
    public srpAeroplaneImpl getsrpAeroplaneImpl()
    {
        return new srpAeroplaneImpl();
    }
    @Bean(name="srpcorrHelicopter")
    public srpHelicopterImpl getsrpHelicopterImpl()
    {
        return new srpHelicopterImpl();
    }
    @Bean(name="dipcorrAeroplane")
    public dipAeroplane getdipAeroplane() {
        return new dipAeroplane();
    }
    @Bean(name="ispcorrAeroplaneCommands")
    public ispAeroplaneCommands getispAeroplaneCommands()
    {
        return new ispAeroplaneCommands();
    }
    @Bean(name="ispcorrAeroplaneDetails")
    public ispAeroplaneDetails getisAeroplaneDetails()
    {
        return new ispAeroplaneDetails();
    }
}

