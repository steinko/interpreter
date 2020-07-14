package steinko.interpreter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Profile("basicConfig")
@Configuration
public class LaurelConfig {
	
	    @Bean
	    WordProducer wordProducer(){
	        return new LaurelWordProducer();
	    }
}
