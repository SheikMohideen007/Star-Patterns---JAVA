package star_patterns;

public class Pattern18 {
	public static void main(String[] args) {
		int n=5;
//		ch+=n;
		for(int i=1;i<=n;i++) {
			char ch='a';
			for(int j=n-i;j>=n-i;j--) {
				ch+=(j-1);
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
