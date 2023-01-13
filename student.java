package CIE;
import java.util.*;
public class student
{	
	Scanner sc=new Scanner(System.in);
	public String usn,name;
	public int sem;
	public void getdata()
	{
		System.out.println("Enter usn , name and sem");
		usn=sc.nextLine();
		name=sc.nextLine();
		sem=sc.nextInt();
	}
	public void disp()
	{
		System.out.println("NAME: "+name);
		System.out.println("USN: "+usn);
		System.out.println("SEM: "+sem);
	}
}

