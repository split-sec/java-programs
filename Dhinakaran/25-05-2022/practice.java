package zoho25052022;

import java.util.*;

public class practice {
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
	}
}
