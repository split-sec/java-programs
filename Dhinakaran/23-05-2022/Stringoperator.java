package zohotask;
import java.util.*;
public class Stringoperator {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String input=in.next();
		int startingpoint=(input.length()/2)+1;
		int total=(int)input.charAt(0)-48;
// Logic 1
		for(int i=startingpoint,j=1;i<input.length();i++,j++) {
			if(input.charAt(i)=='+') {
				total+=((int)input.charAt(j)-48);
			}
			if(input.charAt(i)=='-') {
				total-=((int)input.charAt(j)-48);
			}
			if(input.charAt(i)=='*') {
				total*=((int)input.charAt(j)-48);
			}
			if(input.charAt(i)=='/') {
				total/=((int)input.charAt(j)-48);
			}
		}System.out.println(total);
		
		
// Logic 2
//		char[] chararr=new char[input.length()-startingpoint];
//		int[] intarr=new int[input.length()-startingpoint+1];
//		for(int i=0;i<startingpoint-1;i++) {
//			chararr[i]=input.charAt(startingpoint+i);
//		}
//		for(int i=0;i<startingpoint;i++) {
//			intarr[i]=input.charAt(i)-48;
//		}
//		for(int i=startingpoint,j=1;i<input.length();i++,j++) {
//			if(input.charAt(i)=='+') {
//				total+=((int)input.charAt(j)-48);
//			}
//			if(input.charAt(i)=='-') {
//				total-=((int)input.charAt(j)-48);
//			}
//			if(input.charAt(i)=='*') {
//				total*=((int)input.charAt(j)-48);
//			}
//			if(input.charAt(i)=='/') {
//				total/=((int)input.charAt(j)-48);
//			}
//		}System.out.println(total);
	}
}
