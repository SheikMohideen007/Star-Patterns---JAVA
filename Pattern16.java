package star_patterns;

public class Pattern16 {
	public static void main(String[] args) {
		int n=5;
		char c='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(c);
			}
			c++;
			System.out.println();
		}
				
	}
}
/*

A
BB
CCC
DDDD
EEEEE

*/