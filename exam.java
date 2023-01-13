import CIE.student;
import CIE.internal;
import SEE.external;
import java.util.*;
class exam
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students");
		int n=sc.nextInt();
		int sum[]=new int[5];
		
		external e[]=new external[n];
		for(int i=0;i<n;i++)
		{
		
		e[i]=new external();
		e[i].getdata();
		System.out.print("FINAL MARKS of student"+(i+1)+": ");
		for(int j=0;j<5;j++)
		{
			sum[i]=e[i].emarks[j]+e[i].imarks[j];
			System.out.print(sum[i]+" ");
		}
		System.out.println();
		}
	}
}