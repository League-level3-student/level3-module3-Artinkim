package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String text = "";
		boolean t = false;
		String c;
		for(int i = 0; i < s.length();i++) {
			c = "" + s.charAt(i);
			if(t) {
				text = text + c.toUpperCase(); 
				t = false;
				
			} else {
				text = text + c.toLowerCase();
				t = true;
			}
			
		}
		
		return text;
	}

}
