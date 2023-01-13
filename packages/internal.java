package CIE;
import java.util.*;
public class internal extends student
{
	Scanner sc=new Scanner(System.in);
	public int imarks[]=new int[5];
	public void getdata()
	{
		super.getdata();
		System.out.println("enter cie marks for 5 subjects");
		for(int i=0;i<5;i++)
		{
			imarks[i]=sc.nextInt();
		}
	}
	public void disp()
	{
		
		System.out.print("CIE MARKS: ");
		for(int i=0;i<5;i++)
		{
			System.out.print(imarks[i]+ " ");
		}
		System.out.println();
	}
}
