package _00_Text_Funkifier;

import java.util.Random;

public class ScrambleString extends SpecialString {

	public ScrambleString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		Random rand = new Random();
		char[] c = s.toCharArray();
		int a;
		int b;
		String text = "";
		for(int i = 0;i<s.length();i++) {
			a = rand.nextInt(s.length()-1);
			b = rand.nextInt(s.length()-1);
			char temp = c[a];
			c[a] = c[b];
			c[b] = temp;
		}
		
		for(int i = 0;i<s.length();i++) {
			text = text +c[i];
		}
		return text;
	}

}
