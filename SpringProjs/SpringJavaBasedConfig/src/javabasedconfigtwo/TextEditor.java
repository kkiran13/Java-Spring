package javabasedconfigtwo;

public class TextEditor {
	private SpellChecker spellChecker; 
	
	public TextEditor(SpellChecker spellChecker){
		System.out.println("In TextEditor constructor");
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck(){
		spellChecker.checkSpell();
	}
}
