public class PatternFive {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		int size = (n * 2) - 1;
		int k = 0;
		
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= size; j++) {
				/*if (i == size || j == size) {
					System.out.print(n);
				}else*/ if(i == n && j == n) {
					System.out.print(1);
				}else if (i <= n && j <= n){
					if (i == n) {
						System.out.print((n-j)+1);
					} else if(j == n) {
						System.out.print((n-i)+1);
					}
					else if(i < j || i == j) {
						System.out.print((n-i)+1);
					} else {
						System.out.print((n-j)+1);
					}
				}else if (i > n && j <= n) {
					if(j == n) {
						System.out.print((i-n)+1);
					}else {
						if((i-n-1) != 0) {
							k = i-n-1;
						}else {
							k = j;
						}
						System.out.print((n-k)+1);
					}
				}else if (j > n && i <= n){
					if(i == n) {
						System.out.print((j-n)+1);
					} else {
						if((i-n-1) != 0) {
							k = j-n-1;
						}else {
							k = i;
						}
						System.out.print((n-i)+1);
					}
				} else {
					System.out.print((j-n)+1);
				}
			}
			System.out.println();
		}
	}
}