package _00_Text_Funkifier;

import java.util.ArrayList;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String text = "";
		for(int i = s.length()-1;i>=0;i--) {
			text = text + s.charAt(i);
		}
		
		return text;
	}

}
