/*
	@author Praveenkumar Senthilkumar
	Date: 24-05-2022
	Home Task:
		DHINAKARAN --> D-1,H-1,I-1,N-2,A-2,K-1,R-1
		SARAVANAN --> S-1,A-4,R-1,V-1,N-2
*/

public class CountLogic3 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		char[] arr = scanner.nextLine().toCharArray();
		
		int n = arr.length;
		int[] count = new int[n];
		
		// Using extra Variable
		for(int i = 0; i < n; i++) {
			count[i] += 1;
			for(int j = i+1; j < n; j++) {
				if(arr[i] == arr[j] && arr[i] != '*') {
					count[i] += 1;
					arr[j] = '*';
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(count[i] != 0&& arr[i] != '*') {
				System.out.println(arr[i] + " = " + count[i]);
			}
		}
	}
}