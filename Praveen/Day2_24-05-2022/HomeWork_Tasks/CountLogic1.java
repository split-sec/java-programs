/*
	@author Praveenkumar Senthilkumar
	Date: 24-05-2022
	Home Task:
		DHINAKARAN --> D-1,H-1,I-1,N-2,A-2,K-1,R-1
		SARAVANAN --> S-1,A-4,R-1,V-1,N-2
*/


public class CountLogic1 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		String input = scanner.nextLine();
		
		int n = input.length();
		
		char[] ch = new char[n];
		int[] count = new int[n]; 
		
		int index = 0;
		
		// Storing first character in new array
		ch[index] = input.charAt(0);
		count[index] += 1;
		index++;
		
		// Using Extra new Array
		for(int i = 1; i < n; i++) {
			
			// Checking whether the character is repeated
			int flag = 0;
			for(int k = 0; k < index; k++) {
				if(input.charAt(i) == ch[k]){
					count[k] += 1;
					flag = 1;
				}
			}
			
			// Non Repeated Character will be stored in new array
			if(flag == 0) {
				ch[index] = input.charAt(i);
				count[index] += 1;
				index++;
			}			
		}
		
		// Printing String
		for(int i = 0; i < index; i++) {
			System.out.println(ch[i] + " = " + count[i]);
		}
		
	}
}
