package org.springframework.intrepeter.test.unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.intrepeter.WordProducer;
import org.springframework.intrepeter.YannyWordProducer;

class YannyWordProducerTests {

	@Test
	void shouldReturnLaurel() {
		WordProducer producer = new YannyWordProducer();
		assertEquals(producer.whatIHeard(),"Yanny");
	}

}
