import java.util.*;
import java.lang.*;
public class tsk5 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int size=in.nextInt();
		int tempint;
		
//		for(int i=-size+1;i<size;i++,System.out.println()) {
//			
//			if(i<0) {
//				tempint=(-i)+1;
//			}
//			else tempint=i+1;
//			
//			for(int j=(-size)+1;j<size;j++) {
//				
//				if(j<0) {
//					if((-j)+1>tempint){
//						System.out.print(-j+1);
//					}else {
//						System.out.print(tempint);
//					}
//				}
//				else {
//					if(j+1>tempint){
//						System.out.print(j+1);
//					}else {
//						System.out.print(tempint);
//					}
//				}
//			}
//		}
		
		
//logic 2
		
		
		for(int i=-size+1;i<size;i++,System.out.println()) {
			
			for(int j=(-size)+1;j<size;j++) {
				
				if(Math.abs(j)+1>Math.abs(i)+1) {
					System.out.print(Math.abs(j)+1);
				}
				else {
					System.out.print(Math.abs(i)+1);
				}
				
			}
		}
		
		int[] intarr=new int[size*2-1];
		for(int i=-size+1,j=0;i<size;i++,j++) {
			if(i<0) {
				intarr[j]=-i+1;
			}else {
				intarr[j]=i+1;
			}
		}
		for(int i:intarr) {
			for(int j:intarr) {
				if(j>i) {
					System.out.print(j+" ");
				}else {
					System.out.print(i+" ");
				}
			}System.out.println();
		}
	}

}
