/*
	@author Praveenkumar Senthilkumar
	Date: 24-05-2022
	Home Task:
		DHINAKARAN --> D-1,H-1,I-1,N-2,A-2,K-1,R-1
		SARAVANAN --> S-1,A-4,R-1,V-1,N-2
*/

public class CountLogic8 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		char[] array = scanner.nextLine().toCharArray();
		java.util.Arrays.sort(array);
		
		int n = array.length;
		
		for(int i = 0; i < n-1; ) {
			int count = 1;
			int index = i+1;
			
			while(array[i] == array[index] && index < n) {
				count++;
				i = index;
				index++;
			}
			
			System.out.println(array[i] + " " + count);
			i++;
		}
	}
}