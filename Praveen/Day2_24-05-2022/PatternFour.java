public class PatternFour {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i == 1 || j == 1 || i == n || j == n) {
					System.out.print(1 + " ");
				} else {
					System.out.print( "  ");
				}
			}
			System.out.println();
		}
	}
}