package zoho25052022;
import java.util.*;

public class tsk2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int size=in.nextInt();
		int[] intarray=new int[size];
		
		for(int i=0;i<size;i++)
		{
			intarray[i]=in.nextInt();
		}
		
        for(int i=0;i<size;i++)
        {
			
        	for(int j=i;j<size;j++)
        	{
        		
        		if(intarray[i]>intarray[j] && i%2!=0)
        		{
        			int temp=intarray[i];
					intarray[i]=intarray[j];
					intarray[j]=temp;
				}
        		else if(intarray[i]<intarray[j] && i%2==0)
        		{
        			int temp=intarray[i];
					intarray[i]=intarray[j];
					intarray[j]=temp;
        		}
        		
			}
        	
		}
        
		for(int i:intarray)
		{
			System.out.println(i);
		}
	}

}
