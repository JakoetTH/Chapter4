package Chapter4.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import Chapter4.lsp.violation.Aeroplane;
import Chapter4.lsp.violation.Helicopter;

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
}
