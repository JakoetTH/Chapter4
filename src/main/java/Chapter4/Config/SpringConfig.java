package Chapter4.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import Chapter4.Impl.Helicopter;


@Configuration
public class SpringConfig {
    @Bean(name="HelicopterBean")
    public Helicopter getHelicopter() { return new Helicopter();}

}
