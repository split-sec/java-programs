/*
	@author Praveenkumar Senthilkumar
	Date: 24-05-2022
	Home Task:
		DHINAKARAN --> D-1,H-1,I-1,N-2,A-2,K-1,R-1
		SARAVANAN --> S-1,A-4,R-1,V-1,N-2
*/

public class CountLogic2 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		char[] arr = scanner.nextLine().toCharArray();
		
		int n = arr.length;
		
		char[] ch = new char[n];
		int index = 0;
		
		// Stores Non Duplicate Letters
		for(int i = 0; i < n; i++) {
			int flag = 0;
			for(int j = 0; j < index; j++) {
				if(arr[i] == ch[j]) {
					flag = 1;
				}
			}
			if(flag == 0) {
				ch[index] = arr[i];
				index++;
			}
		}
		
		int[] count = new int[index];
		
		// Counts Non Duplicate Letters
		for(int i = 0; i < index; i++) {
			for(char l : arr) {
				if(ch[i] == l) {
					count[i] += 1;
				}
			}
		}
		
		// Prints Non Duplicate letter with its count
		for(int i = 0; i < index; i++) {
			System.out.println(ch[i] + " = " + count[i]);
		}
		
	}
}