/*
	@author Praveenkumar Senthilkumar
	Date: 24-05-2022
	Home Task:
		DHINAKARAN --> D-1,H-1,I-1,N-2,A-2,K-1,R-1
		SARAVANAN --> S-1,A-4,R-1,V-1,N-2
*/

public class CountLogic4 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		String input = scanner.nextLine();
		
		String nonDuplicates = "";
		
		int n = input.length();
		int[] count = new int[n];
		int index = 0;
		
		// Counting Non Duplicates Using String function
		for(int i = 0; i < n; i++) {
			if(!nonDuplicates.contains(input.charAt(i) + "")) {
				nonDuplicates += input.charAt(i);
				count[index] += 1;
				index++;
			}else{
				count[nonDuplicates.indexOf(input.charAt(i))] += 1;
			}
		}
		
		for(int i = 0; i < index; i++) {
			if(count[i] != 0){
				System.out.println(nonDuplicates.charAt(i) + " = " + count[i]);
			} 
		}
	}
	
}