package star_patterns;

public class Pattern11 {
	public static void main(String[] args) {
		int n=5,num=1;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				num=1;
			}else {
				num=0;
			}
			for(int j=1;j<=i;j++) {
				System.out.print(num%2!=0?"1 ":"0 ");
				num++;
			}
			System.out.println();
		}
	}
}
/* 

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 

*/