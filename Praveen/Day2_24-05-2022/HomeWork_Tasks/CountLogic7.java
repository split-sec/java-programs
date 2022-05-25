/*
	@author Praveenkumar Senthilkumar
	Date: 24-05-2022
	Home Task:
		DHINAKARAN --> D-1,H-1,I-1,N-2,A-2,K-1,R-1
		SARAVANAN --> S-1,A-4,R-1,V-1,N-2
*/


public class CountLogic7 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		char[] ch = scanner.nextLine().toCharArray();
		
		int n = ch.length;
		char[] arr = new char[n+1];
		
		for(int i = 0; i < n; i++) {
			arr[i] = ch[i];
		}
		arr[n] = '\0';
		
		
		// By Swapping Back Side
		for(int i = 0, j = n; i < j; i++) {
			int count = 1;
			for(int k = i+1; k < j; k++) {
				if(arr[i] == arr[k]) {
					count++;
					char temp = arr[k];
					for(int x = k; k < j; k++) {
						arr[k] = arr[k+1];
					}
					arr[j] = temp;
					j--;
				}
			}
			System.out.println(arr[i] + " = " + count);
		}
		
	}
}