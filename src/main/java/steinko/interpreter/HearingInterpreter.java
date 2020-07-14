package steinko.interpreter;

import org.springframework.stereotype.Service;

@Service
public class HearingInterpreter {
	
	private WordProducer wordProducer;

	public HearingInterpreter(WordProducer wordProducer) {
		this.wordProducer = wordProducer;
	}

	public String whatIHeard() {
		
		return  wordProducer.getWord();
	}

}
