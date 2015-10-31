package auto.wire.name;

public class TextEditor {
	private SpellChecker spellChecker;
	   private String name;

	   /*public TextEditor( SpellChecker spellChecker,String name ){ // uncomment this for constructor auto wire
	      this.spellChecker = spellChecker;
	      this.name = name;
	   }*/
	   
	   public void setSpellChecker( SpellChecker spellChecker){ //comment this for constructor auto wire
		      this.spellChecker = spellChecker;
		   }
	   
	   public SpellChecker getSpellChecker() {
	      return spellChecker;
	   }

	   public void setName(String name) { //comment this for constructor auto wiring
	      this.name = name;
	   }
	   
	   public String getName() {
	      return name;
	   }

	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
}
