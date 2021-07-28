package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BalancedBracketsApplication {

	public static void main(String[] args) {
		List<String> bracketArray = new ArrayList<>();
		for(int i = 0; i<10; i++) {
			bracketArray.add(bracketBuilder(0, true));
			System.out.println(" is balanced");
		}
		

	}
	
	private static String bracketBuilder(int length, boolean isBalanced) {
		StringBuilder builder = new StringBuilder();
		List<String> bracketStack = new ArrayList<>();
		char[] brackets = {'[',']','{','}','(',')'}; 
		String bracket = null;
		Random rnd = new Random();
		if(length<2) {
			length = 2*(10+rnd.nextInt(20));
		} 
		else if(length%2 == 1) {
			length += 1;
		}
		int bracketIndex = 0;
		for(int i=0; i<length; i++) {
			int last = bracketStack.size() - 1;
			if(bracketStack.size() > 0)
				bracketIndex = rnd.nextInt(6);
			else
				bracketIndex = 2*rnd.nextInt(3);
			if(bracketStack.size() < length - i && bracketIndex%2 == 0) {
				bracket = Character.toString(brackets[bracketIndex]);
				bracketStack.add(bracket);
			} // End of if(bracketStack.size() < length - i....)
			else {
				char c = (bracketStack.get(last)).charAt(0);
				switch(c) {
				case '[':
					bracket = "]";
					break;
				case '{':
					bracket = "}";
					break;
				case '(':
					bracket = ")";
					break;
				} // End of switch(c)
				bracketStack.remove(last);
			} // End of else
			builder.append(bracket);
		} // End of for(int i=0; i<length; i++)
		if(isBalanced)
			return builder.toString();
		else return builder.append("]{[(").toString();
	} // End of bracketBuilder(...)

	private static boolean isBalanced(String string) {
		List<String> bracketStack = new ArrayList<>();
		int i = 0;
		if(string == null) return false;
		else if(string.isBlank()) return true;
		while(string.length()>i) {
			String bracket = string.substring(i, i+1);
			int last = bracketStack.size() - 1;
			if(bracket.equals("[") || bracket.equals("{") || bracket.equals("("))
				bracketStack.add(bracket);
			else if(bracket.equals("]") || bracket.equals("}") || bracket.equals(")")) {
				char c = bracket.charAt(0);
			} // End of else if(bracket.equals("]") || ....)
		} // End of while(string.length()>i)
		return true;
	}
}
