package org.springframework.intrepeter.test.unit;

import org.junit.jupiter.api.Test;
import org.springframework.intrepeter.HearingInterpreter;
import org.springframework.intrepeter.LarelWordProducer;
import org.springframework.intrepeter.YannyWordProducer;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HearringIntepeterTests {
	
	@Test
	public void shouldReturnLaurel() {
		HearingInterpreter interpreter = new HearingInterpreter(new LarelWordProducer());
		assertEquals("Laurel", interpreter.whatIHeard());
	}
	
	@Test
	public void shouldReturnYanny() {
		HearingInterpreter interpreter = new HearingInterpreter(new YannyWordProducer());
		assertEquals("Yanny", interpreter.whatIHeard());
	}


}
