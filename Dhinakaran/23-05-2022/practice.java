package zohotask;
import java.util.*; 
public class practice {
	static boolean compare(String num1,String num2) {
		if(num1.length()!=num2.length()) {
			return num1.length()>num2.length() ? true:false;
		}else {
			for(int i=0;i<num1.length();i++) {
				if(num1.charAt(i)!=num2.charAt(i)) {
					return num1.charAt(i)>num2.charAt(i) ? true:false;
				}
			}
		} return false;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		practic2 cls=new practic2();
		int size=in.nextInt();
		String[] arr=new String[size]; 
		for(int i=0;i<size;i++) {
			arr[i]=in.next();
		}
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]!=arr[j]) {
					if(cls.compare(arr[i],arr[j])) {
						String tempstring =arr[i];
						arr[i]=arr[j];
						arr[j]=tempstring;
					}
				}
			}
		}for(String i:arr) System.out.println(i);
	}
}
