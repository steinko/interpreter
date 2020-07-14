package steinko.interpreter;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import steinko.interpreter.BaseConfig;
import steinko.interpreter.LaurelConfig;

import static org.junit.Assert.assertEquals;

import org.springframework.test.context.ActiveProfiles;

@RunWith(SpringRunner.class)
@ActiveProfiles("basicConfig")
@ContextConfiguration(classes = {BaseConfig.class, LaurelConfig.class})
public class HearingIterpretedIntTest {

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Test
    public void whatIheard() {
        String word = hearingInterpreter.whatIHeard();


        assertEquals("Laurel", word);
    }
}

