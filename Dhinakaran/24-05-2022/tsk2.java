import java.util.*;
public class tsk2 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		int size=in.nextInt();
		
		for(int i=1;i<=size;i++,System.out.println()) {
			
			for(int j=i;j>0;j--) {
				System.out.print(j+" ");
			}
			
		}
	}

}
