public class PatternOne {
	public static void main(String[] main) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		} 
	}
}