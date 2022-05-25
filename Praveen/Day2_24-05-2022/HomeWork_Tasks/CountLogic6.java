/*
	@author Praveenkumar Senthilkumar
	Date: 24-05-2022
	Home Task:
		DHINAKARAN --> D-1,H-1,I-1,N-2,A-2,K-1,R-1
		SARAVANAN --> S-1,A-4,R-1,V-1,N-2
*/

public class CountLogic6 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		String input = scanner.nextLine();
		
		// Using HashMap
		java.util.HashMap<Character, Integer> map = new java.util.HashMap<>();
		
		int n = input.length();
		
		for(int i = 0; i < n; i++) map.put(input.charAt(i), 0);
			
		for(int i = 0; i < n; i++) {
			map.put(input.charAt(i), ((int) map.get(input.charAt(i))) + 1);
		}
		
		System.out.print(map);
	}
}