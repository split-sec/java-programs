public class PatternThree {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(j >= i) {
					System.out.print(n + " ");
				}else{
					System.out.print((n-i+1) + (j-1) + " ");
				}
			}
			System.out.println();
		}
	}
}