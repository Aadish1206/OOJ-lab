package SEE;
import CIE.internal;
import java.util.*;
public class external extends internal
{
	Scanner sc=new Scanner(System.in);
	public int emarks[]=new int[5];
	public void getdata()
	{	super.getdata();
		System.out.println("enter 5 subject marks for see");
		for(int i=0;i<5;i++)
		{
			emarks[i]=sc.nextInt();
		}
	}
	public void disp()
	{
		System.out.print("SEE MARKS: ");
		for(int i=0;i<5;i++)
		{
			System.out.print(emarks[i]+" ");
		}
		System.out.println();
	}
}
