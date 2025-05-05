package star_patterns;

public class Pattern17 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			char c='A';
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(c);
				c++;
			}
			c-=2;
			for(int j=i;j>=2;j--) {
				System.out.print(c);
				c--;
			}
			System.out.println();
		}
	}
}

/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
*/