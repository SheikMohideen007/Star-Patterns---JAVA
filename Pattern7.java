package star_patterns;

public class Pattern7 {
	public static void main(String[] args) {
		int n=5,odd=1;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=odd;j++) {
				System.out.print("*");	
			}
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			System.out.println();
			odd+=2;
		}
	}
}
/*

	*     
   ***    
  *****   
 *******  
********* 

*/