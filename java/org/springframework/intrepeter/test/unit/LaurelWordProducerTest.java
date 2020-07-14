package org.springframework.intrepeter.test.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.intrepeter.LarelWordProducer;
import org.springframework.intrepeter.WordProducer;

class LarelWordProducerTests {

	@Test
	void shouldReturnLaurel() {
		WordProducer producer = new LarelWordProducer();
		assertEquals(producer.whatIHeard(),"Laurel");
	}

}
