package steinko.interpreter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import steinko.interpreter.HearingInterpreter;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.context.annotation.Profile;

@ActiveProfiles("yanny")
@SpringJUnitConfig(classes= HearingInterpreterActiveProfileTests.TestConfig.class)
public class HearingInterpreterActiveProfileTests {

	@Configuration
	@ComponentScan("steinko.interpreter")
	static class TestConfig {
		
	}
	@Autowired
	HearingInterpreter interpreter;
	
	@Test
	void shouldReturnYannyl() {
		assertEquals("Yanny",  interpreter.whatIHeard());
	}

}
