package steinko.interpreter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import steinko.interpreter.BaseConfig;
import steinko.interpreter.LaurelConfig;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("basicConfig")
@SpringJUnitConfig(classes = {BaseConfig.class, LaurelConfig.class})
public class HearingIterpretedIntTestJunit5 {

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    public void whatIheard() {
        String word = hearingInterpreter.whatIHeard();


        assertEquals("Laurel", word);
    }
}

