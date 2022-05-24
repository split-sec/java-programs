import java.util.*;
public class tsk6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int size=in.nextInt();
		int temp=1;
		for(int i=1;i<=size;i++,System.out.println()) {
			for(int j=0;j<size-i;j++) {
				System.out.print("\t");
			}
			for(int k=0;k<i;k++,temp++) {
//				System.out.print(temp<10 ? " "+temp+" ":temp+" ");
				System.out.print(temp+"\t");
			}
		}
	}

}
