package steinko.interpreter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Primary;


@Profile("yanny")
@Primary
@Configuration
public class YannyConfig {
	
	@Bean
    WordProducer wordProducer(){
        return new YannyWordProducer();
    }

}
