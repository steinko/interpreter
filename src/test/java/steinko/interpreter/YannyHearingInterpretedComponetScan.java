package steinko.interpreter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.context.annotation.Profile;


@Profile("componetScan")
@SpringJUnitConfig(classes= YannyHearingInterpretedComponetScan.TestConfig.class)
public class YannyHearingInterpretedComponetScan {
	
	@ActiveProfiles("componetScan")
	@Configuration
	@ComponentScan("steinko.interpreter")
	static class TestConfig {
		
	}
	@Autowired
	HearingInterpreter interpreter;
	
	@Test
	void shouldReturnLaurel() {
		assertEquals("Yanny",  interpreter.whatIHeard());
	}

}

