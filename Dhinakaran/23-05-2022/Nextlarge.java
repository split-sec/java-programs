package zohotask;
import java.util.*;
public class Nextlarge {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=in.nextInt();
		}
		for(int i=0;i<size;i++) {
			int currentvalue=arr[i];
			int nextmax=arr[i];
			for(int j=i+1;j<size;j++) {
				if(arr[j]>currentvalue) {
					if(currentvalue==nextmax) {
						nextmax=arr[j];
					}else if(arr[j]<nextmax){
							nextmax=arr[j];
					}
				}
			}if(nextmax==currentvalue) {
				System.out.println(-1);
			}else {
				System.out.println(nextmax);
			}
		}
//		int[] sortedarr=arr;
//		for(int i=0;i<size;i++) {
//		for(int j=i+1;j<size;j++) {
//			if(sortedarr[i]>sortedarr[j]) {
//				int temp=sortedarr[i];
//				sortedarr[i]=sortedarr[j];
//				sortedarr[j]=temp;
//			    }
//		    }
//		}
//		for(int i=0;i<size-1;i++) {
//			int temp=arr[i];
//			int nextmax=arr[i];
//			for(int j=0;j<size-1;j++) {
//				if(sortedarr[j]==arr[i]) {
//					nextmax=sortedarr[j+1];
//					break;
//				}
//			}
//		    for(int k=i+1;k<size;k++) {
//		    	if(nextmax==arr[k]) {
//		    		System.out.println(nextmax);
//		    		break;
//		    	}
//		    }
//		}System.out.println(-1);
	}

}
