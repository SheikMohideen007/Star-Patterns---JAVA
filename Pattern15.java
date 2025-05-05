package star_patterns;

public class Pattern15 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			char c='A';
			for(int j=n;j>=i;j--) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}
}
/*

ABCDE
ABCD
ABC
AB
A

*/