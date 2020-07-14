package steinko.interpreter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

@Profile("componetScan")
@SpringJUnitConfig(classes= HearingInterpreterComponentScanTests.TestConfig.class)
public class HearingInterpreterComponentScanTests {
	
	@ActiveProfiles("componetScan")
	@Configuration
	@ComponentScan("steinko.interpreter")
	static class TestConfig {
		
	}
	@Autowired
	HearingInterpreter interpreter;
	
	@Test
	void shouldReturnLaurel() {
		assertEquals("Laurel",  interpreter.whatIHeard());
	}

}
