package star_patterns;

public class Pattern22 {
	 public static void main(String[] args) {
		 int n=4;
		 int num=4;
		 for(int i=1;i<=n*2-1;i++) {
			 for(int j=1;j<=n*2-1;j++) {
				 if(i==1||j==1||i==n*2-1||j==n*2-1) {
					 System.out.print(num);
				 }else {
					 System.out.print(" ");
				 }
			 }
			 num--;
			 System.out.println();
		 }
	}
}
