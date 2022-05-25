public class PatternSix {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int n = scanner.nextInt();
		int number = 1;
		System.out.println();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(j >= (n-(i-1))) {
					System.out.printf("%3d", number++);
				}else {
					System.out.printf("   ");
				}
			}
			System.out.println();
		}
	}
}