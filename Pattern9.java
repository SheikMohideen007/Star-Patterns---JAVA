package star_patterns;

public class Pattern9 {
	public static void main(String[] args) {
		int n=5,odd=1;
		for(int i=1;i<=n*2;i++) {
			
			if(i<=n) {
				for(int j=n;j>=i;j--) {
					System.out.print(" ");
				}
				for(int j=1;j<=odd;j++) {
					System.out.print("*");
				}
				odd+=2;
			}else {
				odd-=2;
				for(int j=1;j<=i-n;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=odd;j++) {
					System.out.print("*");
				}
				
			}
			
			System.out.println();
		}
	}
}
/*
 	*
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/
