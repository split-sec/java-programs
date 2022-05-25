package zoho25052022;
import java.util.*;
public class tsk1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int size=in.nextInt();
		
		int tempint=0;
		
		int a=1,b=size*2,c=0;
		
		for(int i=1;i<=size;i++) {
			for(int j=0;j<size-i;j++) {
				System.out.print("\t");
		}
			
		int temp=tempint;
		for(int j=0;j<size;j++) {
			System.out.print(temp+a+"\t");
			temp+=a;;
		}
		tempint+=b+a;
		b=b+c;
		c=b-c;
		b=b-c;
		a=-a;
		System.out.println();
		}
		
		
//		for(int i=1;i<=size;i++,System.out.println()) {
//			for(int j=0;j<size-i;j++) {
//				System.out.print("\t");
//			}
//			temp=i;
//			while(temp%2==1) {
//				for(int k=tempint+1;k<=tempint+size;k++) {
//					System.out.print(k+"\t");
//				}
//				temp++;
//			}
//			temp=i;
//			while(temp%2==0) {
//				for(int k=tempint+size;k>tempint;k--) {
//					System.out.print(k+"\t");
//				}
//				temp++;
//			}tempint+=size;
//		}
//		tempint=4;
//		int tempint1=size;
//		for(int i=1;i<=size;i++,System.out.println()) {
//			for(int j=0;j<size-i;j++) {
//				System.out.print("\t");
//			}tempint1=-tempint1;
//			for(int k=tempint+tempint1+1;k>tempint;k--) {
//				System.out.print(k+"\t");
//			}
//			for(int k=tempint+size;k>tempint && temp==false;k--) {
//				System.out.print(k+"\t");
//			}
//			temp^=temp;
//			tempint+=size;
//		}
	}

}
