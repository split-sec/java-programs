public class FifthPattern2 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int n = scanner.nextInt();
		
		int size = (n * 2) - 1;
		
		int[][] matrix = new int[size][size];
		
		// Creating Template Matrix
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				matrix[i][j] = n+1;
			}
		}
		
		// Decrementing Extra Counts in outer layers
		for(int i = 0; i < (size / 2) + 1; i++) {
		
			for(int j = i; j < size - i; j++) {
				for(int k = i; k < size - i; k++) {
					matrix[j][k]--;
				}
			}
			
		}
		
		// Printing Edited Template
		System.out.println();
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}