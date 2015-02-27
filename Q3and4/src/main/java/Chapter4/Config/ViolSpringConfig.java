package Chapter4.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import Chapter4.lsp.violation.Aeroplane;
import Chapter4.lsp.violation.Helicopter;
import Chapter4.ocp.violation.ocpAeroplane;
import Chapter4.srp.violation.srpAeroplane;
import Chapter4.srp.violation.srpHelicopter;
import Chapter4.dip.violation.dipAeroplane;
import Chapter4.isp.violation.ispAeroplaneCommands;
import Chapter4.isp.violation.ispAeroplaneDetails;

@Configuration
public class ViolSpringConfig {
    @Bean(name="lspviolAeroplane")
    public Aeroplane getlspAeroplane()
    {
        return new Aeroplane();
    }
    @Bean(name="lspviolHelicopter")
    public Helicopter getlspHelicopter()
    {
        return new Helicopter();
    }
    @Bean(name="ocpviolAeroplane")
    public ocpAeroplane getocpAeroplane()
    {
        return new ocpAeroplane();
    }
    @Bean(name="srpviolAeroplane")
    public srpAeroplane getsrpAeroplane() {
        return new srpAeroplane();
    }
    @Bean(name="srpviolHelicopter")
    public srpHelicopter getsrpHelicopter() {
        return new srpHelicopter();
    }
    @Bean(name="dipviolAeroplane")
    public dipAeroplane getdipAeroplane() {
        return new dipAeroplane();
    }
    @Bean(name="ispviolAeroplaneCommands")
    public ispAeroplaneCommands getispAeroplaneCommands() {
        return new ispAeroplaneCommands();
    }
    @Bean(name="ispviolAeroplaneDetails")
    public ispAeroplaneDetails getispAeroplaneDetails() {
        return new ispAeroplaneDetails();
    }
}
