public class StringSort {
	public static void main(String[] args) {
		
		// Gets User Input
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String[] array = sc.nextLine().split(",");
		
		// Sorts String Array 
		java.util.Arrays.sort(array);
		
		// Sorts String Length 
		int n = array.length;
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				
				// Lesser Length
				if((array[j]).length() < array[i].length()){
					String temp = array[i];
					array[i] = array[j];
					int x = j;
					for(int k = x - 1; k >= i + 1; k--) {
						array[x] = array[k];
						x = k;
					}
					array[x] = temp;
				}
				// Equal Length
				/*else if((array[j]).length() == array[i].length()) {
					int x = 1;
					do {
						if(array[j].charAt(x) < array[i].charAt(x)) {
							String temp = array[i];
							array[i] = array[j];
							int x = j;
							for(int k = x - 1; k >= i + 1; k--) {
								array[x] = array[k];
								x = k;
							}
							array[x] = temp;
							break;
						}
					}while(true);
				}*/
			}
		}
		
		// Prints Array
		for(String s : array) System.out.print(s + " ");
	}
}