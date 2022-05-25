public class SnakePattern {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		// Getting Input
		int n = scanner.nextInt();
		
		System.out.println();
		
		// Calculating rows and colums
		int rows = n;
		int columns = (n * 2) - 1;
		
		for (int i = 1; i <= rows; i++) {
			
			// Number Starting position
			int startPosition = n - (i - 1);
			
			// Printing Spaces
			for(int j = 1; j < startPosition; j++) {
				System.out.print("   ");
			}
			
			/*
			// Creating Flags for both Zeroth and One index
			int directionFlag = (i - 1) & 1;
			int oddStarterFlag = i & 1;
			
			// Creating even row starting numbers
			int evenStarter = (i * n);
			int oddStarter = (((i - 1) * n) + 1);
			*/
			
			// Alloting starting number based on even or odd row
			int number = (i * n) * (i - 1) & 1 + (((i - 1) * n) + 1) * (i & 1);
			
			/*
			// Incrementer and Decrementer based on even or odd row
			int checker = ((directionFlag * -2) + 1);
			*/
			
			// Printing Numbers
			for(int j = 1; j <= n; j++) {
				System.out.printf("%3d", number);
				number += ((directionFlag * -2) + 1);
			}	
			
			/*
			//----------------------------------------------------------------------
			for(int j = 1, number = ((i - 1) * n) + 1; j <= n && i % 2 != 0; j++) {
				System.out.printf("%3d", number);
				number++;
			}
			
			for(int j = 1, number = i * n; j <= n && i % 2 == 0; j++) {
				System.out.printf("%3d", number);
				number--;
			}
			//----------------------------------------------------------------------
			*/
					
			// Printing Next Line
			System.out.println();
		}
	}
} 