package javaPatterns;


public class JavaPatterns {
	


	public static void main(String[] args) {

// 1)	Creating solid rectangle
//		*******
//		*******
//		*******
//		*******
//		*******		
//		int n = 5;
//		int m =7;
//
//		for(int i=1; i<=n ; i++) {
//			for(int j=1; j<=m ; j++) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}
	
		
		
		
		
//2)	Creating Hallow rectangle
//		*******
//		*     *
//		*     *
//		*     *
//		*******
//		int n = 5;
//		int m =4;
//
//		for(int i=1; i<=n ; i++) {
//			for(int j=1; j<=m ; j++) {
//			if(i==1 || j==1 || i==n || j==m) {
//				System.out.print("*");
//			}else {
//				System.out.print(" ");
//			}
//		}
//			System.out.println();
//		}
		
//3) Creating  half Pyramid	right
		
//		*
//		**
//		***
//		****
//		*****
//		
//		int n = 5;
//				
//		for(int i=1; i<=n;i++) {
//			for(int j=1;j<=i; j++) {
//				
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		
		
//4) Creating inverted half Pyramid	right
		
//		*****
//		****
//		***
//		**
//		* 
		
//		int n = 5;
	
//		for(int i=1;i<=n;i++) {
//			for(int j=i; j<=n;j++) {			 
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	OR	
//		for(int i=n;i>=1;i--) {
//			for(int j=1; j<=i;j++) {			 
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//5) Creating inverted half Pyramid	left
//			*
//		   **
//		  ***
//		 ****
//		*****
		
//		int n=5;
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");	
//			}
//			System.out.println();
//		}
	
// 	6) number pyramid
//		1
//		12
//		123
//		1234
//		12345
		
//		int n = 5 ;
//		
//		for(int i=1;i<=n;i++) {
//			for(int j=1; j<=i;j++){
//			System.out.print(j);
//		}
//			System.out.println();
//	  }
		
//	7)inverted number pyramid
//		12345
//		1234
//		123
//		12
//		1
		
//		int n = 5 ;
//   		
//		for(int i=1;i<=n;i++) {
//			for(int j=1; j<=n-i+1 ;j++){
//			System.out.print(j);
//		}
//			System.out.println();
//	  }
		
//	8)Floyd's Triangle
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15 
//		
//		int n=5;
//		int k =1;
		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i; j++){
//			System.out.print(k+" ");
//				k++;		 
//			}
//			System.out.println();
//		}
//		
//	9) 0-1 triangle
//		1 
//		0 1 
//		1 0 1 
//		0 1 0 1 
//		1 0 1 0 1 
		
//		int n=5;
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				int sum =i+j;
//			if(sum % 2 == 0) {
//				System.out.print(1 + " ");
//			}else{
//				System.out.print(0 + " ");
//			}
//		}
//			System.out.println();
//	}
	
		
//		10) Butterfly pattern
		
//		*        *
//		**      **
//		***    ***
//		****  ****
//		**********
//		**********
//		****  ****
//		***    ***
//		**      **
//		*        *

		
//		int n =5;
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			int spaces = 2*(n-i);
//			for(int j=1; j<=spaces; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=n; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			int spaces = 2*(n-i);
//			for(int j=1; j<=spaces; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//	11) print pattern solid Rhombus

//	     *****
//	    *****
//	   *****
//	  *****
//	 *****
//	  int n = 5;
//	  
//	  for(int i=1; i<=n; i++) {
//		  
//		  for(int j=1; j<=n-i; j++) {
//			  System.out.print(" ");
//		  }
//		  for(int j=1; j<=n; j++) {
//			  System.out.print("*");
//		  }
//		  System.out.println();
//	  }
	  
//		12) print pattern hallow Rhombus
//	     *****
//	    *   *
//	   *   *
//	  *   *
//	 *****
//		
//		int n=5;
//		
//		for(int i=1; i<=n; i++) {
//			  
//			  for(int j=1; j<=n-i; j++) {
//				  System.out.print(" ");
//			  }
//			  for(int j=1; j<=n; j++) {
//				  if(i==1 || i==n || j==1 || j==n) {
//				  System.out.print("*");
//			    }else{
//					  System.out.print(" ");
//				  }
//			  }
//			  System.out.println();
//		  }
		
//		13) Number pyramid
//        1 
//       2 2 
//      3 3 3 
//     4 4 4 4 
//    5 5 5 5 5 
		
//		int n=5;
//		for(int i=1; i<=n; i++) {
//			
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}
//	14) palindromic pattern
//		
//	    1
//	    212
//	   32123
//	  4321234
//	 543212345
		
//		int n =5;
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=i; j>=1; j--) {
//				System.out.print(j);
//			}
//			for(int j=2; j<=i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//a		15)Diamond pattern
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		*********
//		 *******
//		  *****
//		   ***
//		    *

//		int n =5;
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			int num = 2*i-1;
//			for(int j=1; j<=num; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		for(int i=n; i>=1; i--) {
//			for(int j=1; j<=n-i; j++) {
//				System.out.print(" ");
//			}
//			int num = 2*i-1;
//			for(int j=1; j<=num; j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
//		15)hour glass pattern
		
//		*********
//		 *******
//		  *****
//		   ***
//		    *
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//
int n =5;

for(int i=n; i>=1; i--) {
	for(int j=1; j<=n-i; j++) {
		System.out.print(" ");
	}
	int num = 2*i-1;
	for(int j=1; j<=num; j++) {
		System.out.print("*");
	}
	
	System.out.println();
}
for(int i=1; i<=n; i++) {
	for(int j=1; j<=n-i; j++) {
		System.out.print(" ");
	}
	int num = 2*i-1;
	for(int j=1; j<=num; j++) {
		System.out.print("*");
	}
	
	System.out.println();
}

		
  }
}
