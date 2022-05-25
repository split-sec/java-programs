package zohotask;
import java.util.*;
public class Stringarrsort {
	static int converttoint(String s) {
		int temp=0;
		if(s.charAt(0)=='-') {
			for(int i=1;i<s.length();i++) {
				temp*=10;
				temp+=(int)(s.charAt(i))-48;
			}return -temp;
		}else {
			for(int i=0;i<s.length();i++) {
				temp*=10;
				temp+=(int)(s.charAt(i))-48;
			}
			return temp;
		}
    }
//	static int converttoint(String s) {
//		int number=0;
//		if(s.charAt(0)=='-') {
//			for(int i=1;i<s.length();i++) {
//				number*=10;
//				number+=s.charAt(i)-'0';
//			}return -number;
//		}else {
//			for(int i=0;i<s.length();i++) {
//				number*=10;
//				number+=s.charAt(i)-'0';
//			}return number;
//		}
//	}
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=in.nextInt();
		int[] intarr=new int[size];

//logic 1;
//		String[] arr=new String[size];
//		for(int i=0;i<size;i++) {
//			arr[i]=in.next();
//		}
//		for(int i=0;i<size;i++) {
//			intarr[i]=converttoint(arr[i]);
//		}
//		for(int i=0;i<size;i++) {
//			for(int j=i+1;j<size;j++) {
//				if(intarr[i]>intarr[j]) {
//					int temp=intarr[i];
//					intarr[i]=intarr[j];
//					intarr[j]=temp;
//					
//				}
//			}
//		}
//		for(int i:intarr) {
//			System.out.println(i);
//		}
		
		
		// logic 2;
		for(int i=0;i<size;i++) {
			intarr[i]=converttoint(in.next());
		}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(intarr[i]>intarr[j]) {
					int temp=intarr[i];
					intarr[i]=intarr[j];
					intarr[j]=temp;
				}
			}
		}for(int i:intarr)System.out.println(i);
	}
}
