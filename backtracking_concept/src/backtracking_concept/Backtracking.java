package backtracking_concept;

import java.util.ArrayList;
import java.util.List;

// find the all possible combinations for the string of n numbers

public class Backtracking {
	public static void probablity(String str, String prerm, int indx) {
		if(str.length()==0) {
			System.out.print(prerm+ " ");
			return;
		}
		for(int i=0; i<str.length(); i++){
		char currChar = str.charAt(i);
		String newStr = str.substring(0, i) + str.substring(i+1);
		 probablity(newStr, prerm+currChar, indx+1);
		}
	}

	public static void main(String[] arg) {
//		String  str= "ABC";
//		probablity(str, "", 0);
		
		
	}
}
