package com.learning;

public class ReverseString
{
	
	public String reverseString (String str) {
		
		char[] charArray = str.toCharArray();
		int left=0;
		int right = charArray.length -1;
		
		while(left < right) {
		//swap character at left and right position	
			char temp = charArray[left];    	
			charArray[left]= charArray[right];
			charArray[right] = temp;		
		
		//move pointer towards 	each other
			left++;
			right --;
		}
				
		return new String(charArray);
	}
}