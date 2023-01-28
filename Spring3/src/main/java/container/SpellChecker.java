package container;

import org.springframework.stereotype.Component;

@Component
public class SpellChecker {
	
	SpellChecker(){
		System.out.println("I'm in SpellChecker Constructor");
	}
	
	public void checkSpelling() {
		System.out.println("Yeah ! Spelling is correct");
	}

}
