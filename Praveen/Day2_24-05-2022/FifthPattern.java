public class FifthPattern {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int n = scanner.nextInt();
		int size = (n * 2) - 1;
		int c = n+1;
		int copy = size;
		
		System.out.println();	
		for (int i = 1; i <= size; i++) {
			if (i <= n) {
				c--;
				
				int k = n;
				// Left
				for (int j = 1; j <= i-1; j++) {
					System.out.print(k);
					k--; 
				}
				
				// Center
				for(int j = 1; j <= copy; j++) {
					System.out.print(c);
				}
				copy = copy - 2;
				
				k++;
				// right
				for (int j = 1; j <= i-1; j++) {
					System.out.print(k);
					k++;
				}
			} else {
				c++;
				copy = copy + 2;
				
				int k = n;
				// Left
				for (int j = 1; j <= size-i+1; j++) {
					System.out.print(k);
					k--; 
				}
				
				// center
				for(int j = 1; j <= copy; j++) {
					System.out.print(c);
				}
				
				k++;
				// Right
				for (int j = 1; j <= size-i+1; j++) {
					System.out.print(k); 
					k++;
				}
			}
			System.out.println();
		}
	}
}