package recurssionproblems;

import java.util.ArrayList;
import java.util.HashSet;

// Find sum of first n natural numbers
public class Recurssion {
	public static void printSum(int i, int n, int sum) {

		if (i == n) {
			sum += i;
			System.out.println(sum);
			return;
		}

		sum += i;
		printSum(i + 1, n, sum);

	}

	// Find factorial n natural numbers
	public static int factorial(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	// 0 1 1 2 3 5 8 13 21 34
	// Print fibonacci n natural numbers
	public static void fibonacci(int a, int b, int n) {
		if (n == 0) {
			return;
		}
		int c = a + b;
		System.out.print(" " + c);
		fibonacci(b, c, n - 1);
	}

	// Print x^n stack height of n
	public static int xToPower(int x, int n) {
		if (n == 0) {
			return 1;
		}
		if (x == 0) {
			return 0;
		}
		// return x * xToPower(x, n-1);
		// or we can write
		if (n % 2 == 0) {
			return xToPower(x, n / 2) * xToPower(x, n / 2);
		} else {
			return xToPower(x, n / 2) * xToPower(x, n / 2) * x;
		}
	}

	// reverse a given string
	public static void stringRev(String str, int n) {
		if (n == 0) {
			System.out.println(str.charAt(n));
			return;
		}
		System.out.print(str.charAt(n));
		stringRev(str, n - 1);

	}
	// Find the first and last occurenece of the character in a given string
	// abaacdaefaah first = 0; last = 10;

	public static int first = -1;
	public static int last = -1;

	public static void charOcuurence(String str, char element, int idx) {
		if (idx == str.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}

		char currChar = str.charAt(idx);
		if (currChar == element) {
			if (first == -1) {
				first = idx;
			} else {
				last = idx;
			}
		}
		charOcuurence(str, element, idx + 1);
	}

	// check weather the given array is sorted(strictly increasing)
	// {1, 2, 3, 4, 5}
	public static boolean strkSorted(int arr[], int indx) {
		if (indx == arr.length - 1) {
			return true;
		}
		if (arr[indx] < arr[indx + 1]) {
			// is sorted till now
			return strkSorted(arr, indx + 1);
		} else {
			return false;
		}
	}

	// move all x to the end of the string
	// "assxkoxxixl" => " asskoilxxxx"
	public static void moveChar(String str, char ch, int indx, String newString, int count) {

		if (indx == str.length()) {
			for (int i = 0; i < count; i++) {
				newString += ch;
			}
			System.out.println(newString);
			return;
		}

		char currChar = str.charAt(indx);
		if (currChar == ch) {
			count++;
			moveChar(str, ch, indx + 1, newString, count);
		} else {
			newString += currChar;
			moveChar(str, ch, indx + 1, newString, count);
		}

	}
	// Remove duplicate characters in the string
	// "assxkoxxixl" => " askoilx

	public static boolean[] map = new boolean[26];

	public static void removeDublicate(String str, int indx, String newString) {
		if (indx == str.length()) {
			System.out.println(newString);
			return;
		}

		char currChar = str.charAt(indx);
		if (map[currChar - 'a']) {
			removeDublicate(str, indx + 1, newString);
		} else {
			newString += currChar;
			map[currChar - 'a'] = true;
			removeDublicate(str, indx + 1, newString);
		}
	}

	// Print all subsequences of a string\
	// "abc" => "abc, ab, bc, ac, a, b, c" b must come after a and c must come after
	// b
	public static void subsequence(String str, int indx, String newString) {
		if (indx == str.length()) {
			System.out.println(newString);
			return;
		}

		char currChar = str.charAt(indx);
		// to be
		subsequence(str, indx + 1, newString + currChar);
		// not to be
		subsequence(str, indx + 1, newString);
	}

	// Print all unique subsequences of a string no repeatation
	// "aaa" => "aaa, aa, a, " " " repeated string are aa aa a a
	public static void uniqueSubsequence(String str, int indx, String newString, HashSet<String> nStr) {
		if (indx == str.length()) {
			if (nStr.contains(newString)) {
				return;
			} else {
				System.out.println(newString);
				nStr.add(newString);
				return;
			}
		}

		char currChar = str.charAt(indx);
		// to be
		uniqueSubsequence(str, indx + 1, newString + currChar, nStr);
		// not to be
		uniqueSubsequence(str, indx + 1, newString, nStr);
	}

	// Print all Keypad combinations
	public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	public static void keypadCombo(String str, int indx, String comb) {
		if (indx == str.length()) {
			System.out.println(comb);
			return;
		}
		char currChar = str.charAt(indx);
		String mapping = keypad[currChar - '0'];
		for (int i = 0; i < mapping.length(); i++) {

			keypadCombo(str, indx + 1, comb + mapping.charAt(i));
		}

	}
	// Print all permutations of the Sring
	//"abc" => "abc", "acb", "bac", "bca", "cab", "cba" 

		public static void strPermutaion(String str, String permutation) {
			if (str.length()==0) {
				System.out.println(permutation);
				return;
			}
			for(int i =0; i<str.length(); i++) {
				
				char currChar = str.charAt(i);
				//"abc"  -> "ab"
 				String newStr = str.substring(0, i) + str.substring(i+1);
 				strPermutaion(newStr, permutation+currChar);
			}

		}
		
		// Find all paths in a maze to move from (0,0) to (n,m)
		// n=3, m=3; consitions- 1) you can only move to right 2) you can only move downwards

			public static int allPaths(int i, int j, int n, int m) {
				if (i == n || j == m){
					return 0;
				}
				if (i == n-1 && j == m-1){
					return 1;
				}
				//move downward
				int downPaths = allPaths(i+1, j, n, m);
				//move right
				int rightpaths = allPaths(i, j+1, n, m);
				
				return downPaths+rightpaths;
			}
			
	//Place tiles of size 1 * m in a floor of size n*m;
			public static int placeTiles(int n, int m) {
				if(n==m) {
					return 2;
				}
				if(n<m) {
					return 1;
				}
				//vertical placement
				int verticalPlacement =  placeTiles(n-m, m);
				//horizontal placement
				int horizontalPlacement = placeTiles(n-1, m);
				
				return verticalPlacement + horizontalPlacement;
			}
			
	//Find number of ways in whichh you can invite n number of peoplpe single or in pairs
		public static int invitePpl(int n) {
		if(n<=1) {
			return 1;
		}
			//invite one person each
		int singleGuest = invitePpl(n-1);
			// invite in pairs
		int pairGuest = (n-1) * invitePpl(n-2);
		return singleGuest + pairGuest;	
		
		}

	// Print all subset of a set of n natural numbers
		private static void printSubset(ArrayList<Integer> subset) {
			for(int i=0; i<subset.size(); i++) {
				System.out.print(subset.get(i)+ " ");
			}
			System.out.println();
		}
		public static void subSets(int n, ArrayList<Integer> subset) {
		if(n==0) {
			printSubset(subset);
			return;
		}
		//add
		subset.add(n);
		subSets(n-1, subset);
		//not to add
		subset.remove(subset.size()-1);
		subSets(n-1, subset);
	}
			
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int n =10;
		// sum of integer
//			printSum(1, n, 0);

		// factorial
//			int ans = factorial(n);
//			System.out.println(ans);

		// fibonnaci
//			int a = 0; int b=1;
//			System.out.print(a + " " + b );
//			fibonacci(a, b, n-2);

		// find x^n
//			int x = 2;
//			System.out.println( xToPower(x, n));

		// Reverse String
//			String str = "hello world";
//			int l = str.length()-1;
//			stringRev(str, l);

		// first and last occurenece of the character in a given string
//			String str = "abaacdaefaah";
//			char ele = 'a';
//			charOcuurence(str, ele ,0);

//			weather the given array is sorted(strictly increasing)
//			int arr[] = {1, 2, 3, 4, 5};
//			System.out.println(strkSorted(arr, 0));

		// move all x to the end of the string
//			 String str =  "assxkoxxixl";
//			 moveChar(str, 's', 0, "", 0 );

		// Remove duplicate characters in the string
		// "assxkoxxixl" => " askoilx"
//			 String str =  "assxkoxxixl";
//			 removeDublicate(str, 0, "" );

//		 all subsequences of a string
//			String str = "abc";
//			subsequence(str, 0 , "");
//		 all unique subsequences of a string without repeatation
//		String str = "aaa";
//		HashSet<String> nStr = new HashSet<>();
//		uniqueSubsequence(str, 0, "", nStr);

//		print all keypad combinations
//		String str = "23";
//		keypadCombo(str, 0, "");

//		Print all permutation of the string
//		String str = "abc";
//		strPermutaion(str, "");
		
		//Count all paths from (0,0) to (n,m)
//		int n =4;
//		int m=4;
//		System.out.println(allPaths(0, 0, n, m));
		
		//Place tiles of size 1 * m in a floor of size n*m;
//		int n = 6;
//		int m =5;
//		System.out.println(placeTiles(n, m));
		
		//number of ways in whichh you can invite n number of peoplpe single or in pairs
//		int n = 4;
//		System.out.println(invitePpl(n));
		
		// Print all subset of a set of n natural numbers
		int n =3;
		ArrayList<Integer> subset = new ArrayList<Integer>();
		subSets(3, subset);
	}

}
