package star_patterns;

public class Pattern12 {
	public static void main(String[] args) {
		int n=5,space=n*2-2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int j=1;j<=space;j++) {
				System.out.print("-");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			space-=2;
			System.out.println();
		}
	}

}
/*

1--------1
12------21
123----321
1234--4321
1234554321

*/