import java.util.*;
public class tsk3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int size=in.nextInt();
		
//		logic 1
		
//		int counter=size-1;
		
//		for(int i=size;i>0;i--,System.out.println()) {
		
//			for(int j=i;j<=size;j++) {
//				System.out.print(j+" ");
//			}
//		    for(int k=0;k<counter;k++) {
//				System.out.print(size+" ");
//			}
//		    counter--;
//		}
		
//		Logic 2
		
		for(int i=size;i>0;i--,System.out.println()) {
			
			for(int j=i,k=0;k<size;j++,k++) {
				
				if(j>size) {
					System.out.print(size+" ");
				}
				else {
					System.out.print(j+" ");
				}
			}
		}
	}

}
