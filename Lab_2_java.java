import java.util.Scanner;

class Student{
   String usn;
   String name;
   int credits[];
   int marks[];
   double sgpa=0;
   int crts=0;
   int totcred=0;

   void acceptor(String usn,String name,int creadits[],int marks[]){

    this.usn=usn;
    this.name=name;
    this.credits=creadits;
    this.marks=marks;




   }
  
   Student(int credsize){
       credits=new int[credsize];
       marks=new int[credsize];
   }

   void display(){
      System.out.print("\n-------------\nusn:"+usn+"\n"+"name:"+name+"\n"+"sgpa:"+sgpa+"\n");

   }
   void sgpacalc(){
        for(int i=0;i<marks.length;i++){
            if(marks[i]>=90)crts=10;
            else if(marks[i]>=80)crts=9;
            else if(marks[i]>=70)crts=8;
            else if(marks[i]>=60)crts=7;
            else if(marks[i]>=50)crts=6;
            else if(marks[i]>=40)crts=5;
            else if(marks[i]>=36)crts=4;
            else if(marks[i]>=0)crts=0;
            sgpa+=crts*credits[i];
            totcred+=credits[i]*10;

        }
        sgpa=(sgpa/totcred)*10;
        
   }

}


 class lab_2 {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of courses");
        int n=s.nextInt();
        int credits[]=new int[n];
        int marks[]=new int[n];
        Student s1=new Student(n);
        System.out.println("Enter the creadits of the courses:");
        for(int i=0;i<n;i++){
            credits[i]=s.nextInt();

        }
        System.out.println("Enter your  usn,name");
        String usn=s.next();
        String skipline=s.nextLine();//consumes \n of previous next()
        String name=s.nextLine();// for spaced input
        System.out.println("Enter your marks in each subject");
       
        
        for(int i=0;i<n;i++){

            System.out.print("enter the marks obtained in "+i+" course (credits= "+credits[i]+") :");
            marks[i]=s.nextInt();

        }
        s1.acceptor(usn, name,credits,marks);
        s1.sgpacalc();
        s1.display();
        s.close();


        

            

        
    }
    
}