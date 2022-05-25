package zohotask;
import java.lang.*;
import java.util.*;

public class practic2 {
	static boolean plaincompare(String num1,String num2) {
		for(int i=0;i<num1.length();i++) {
			if(num1.charAt(i)!=num2.charAt(i)) {
				return num1.charAt(i)>num2.charAt(i) ? true:false;
			}
		}return true;
	}
	static boolean compare(String num1,String num2) {
		if(num1.charAt(0)=='-' && num2.charAt(0)=='-') {
			if(num1.length()!=num2.length()) {
				return num1.length()>num2.length()?false:true;
			}else {
				return plaincompare(num1,num2)? false:true;
			}
		}else if(num1.charAt(0)!='-' && num2.charAt(0)=='-' ||  num1.charAt(0)=='-' && num2.charAt(0)!='-') {
			return num1.charAt(0)!='-' ? true : false;
		}else{
			if(num1.length()!=num2.length()) {
				return num1.length()>num2.length() ? true:false;
			}else {
				return plaincompare(num1,num2)? true:false;
			}
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the list :");
		int size=in.nextInt();
		String[] arr=new String[size];
		for(int i=0;i<size;i++) {
			arr[i]=in.next();
		}
		Arrays.sort(arr);
	    for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i].length()>arr[j].length()) {
					String temp=arr[i];
					arr[i]=arr[j];
					int x=j;
					for(int k=x-1;k>=i+1;k--) {
						arr[x]=arr[k];
						x=k;
					}arr[x]=temp;
				}
			}
		}
	    for(String i:arr) {
			System.out.println(i);
	    }
    }
}
