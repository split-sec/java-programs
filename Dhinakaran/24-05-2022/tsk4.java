import java.util.*;
public class tsk4 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int size=in.nextInt();
		
		for(int i=0;i<size;i++,System.out.println()) {
			
			for(int j=0;j<size;j++) {
				
				if(i==0 || i==size-1 || j==0 || j==size-1) {
					System.out.print("1");
				}
				else {
					System.out.print(" ");
				}
			}
		}
	}

}
