package star_patterns;

public class Pattern10 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n*2;i++) {
			if(i==n+1) {
				i++;
			}
			if(i<=n) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			}else {
				for(int j=n;j>=i-n;j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
/*

*
**
***
****
*****
****
***
**
*

*/