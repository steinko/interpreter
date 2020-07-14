package steinko.interpreter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import steinko.interpreter.LaurelWordProducer;
import steinko.interpreter.LaurelConfig;
import steinko.interpreter.WordProducer;
import steinko.interpreter.BusinessConfig;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ActiveProfiles("laurelcontextconfig")
@SpringJUnitConfig(classes = { BusinessConfig.class, LaurelConfig.class})
public class LaurelContextConfigIntTests {
	@Profile("laurelcontextconfig")
	@Configuration
	static class Config { }
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private WordProducer producer;
	
	@Test
	void shoudlHaveLoadeAppContext() { 
		assertNotNull(applicationContext);
		
	}
	
	@Test
	void shoudlHaveLoadeYanny() { 
		
		assertTrue(producer instanceof LaurelWordProducer);
		
	}

}
