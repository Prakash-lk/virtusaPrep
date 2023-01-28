package container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TextEditor {
	private SpellChecker spellChecker;

	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
