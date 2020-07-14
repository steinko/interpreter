package steinko.interpreter;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import steinko.interpreter.HearingInterpreter;
import steinko.interpreter.LaurelConfig;
import steinko.interpreter.BusinessConfig;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@ActiveProfiles("basicConfig")
@SpringJUnitConfig(classes= {BusinessConfig.class,LaurelConfig.class })
class LaurelHearingIntepretedIntTests {
	@Autowired
	HearingInterpreter interpreter;

	@Test
	void shouldReturnLaurel() {
		
		assertEquals(interpreter.whatIHeard(),"Laurel");
	}

}

