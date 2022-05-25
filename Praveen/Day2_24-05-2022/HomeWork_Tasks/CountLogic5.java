/*
	@author Praveenkumar Senthilkumar
	Date: 24-05-2022
	Home Task:
		DHINAKARAN --> D-1,H-1,I-1,N-2,A-2,K-1,R-1
		SARAVANAN --> S-1,A-4,R-1,V-1,N-2
*/

public class CountLogic5 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		char[] arr = scanner.nextLine().toCharArray();
		
		int[] count = new int[26];
		
		int n = arr.length;
		
		// Counting based on ASCII
		for(char c : arr) {
			count[c - 'A'] += 1;
		}
		
		for(int i = 0; i < 26; i++) {
			if(count[i] != 0) {
				System.out.println(((char)(i+'A')) + " " + count[i]);
			}
		}
	}
}