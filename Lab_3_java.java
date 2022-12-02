import java.util.Scanner;

 class Book{

   int num_pages;
   double price;
  String name;
  String author;
   Book(){
    num_pages=0;
    price=0.0;
    name="some_book";
    author="amshu";
  }
   Book(int num_pages,double price, String name, String author){
    this.num_pages=num_pages;
    this.price=price;
    this.name=name;
    this.author=author;
  }
  void set_data(int num_pages,double price, String name, String author)  {
       this.num_pages=num_pages;
       this.price=price;
       this.name=name;
       this.author=author;

  }
  void get_data(){
    System.out.println("Book details\nname: "+name+"\nauthor: "+author+"\nnmber of pages: "+num_pages+"\nprice: "+price);
    System.out.println("\n------------------------\n");
  }
  public String toString(){
    return ("Book details\nname: "+name+"\nauthor: "+author+"\nnmber of pages: "+num_pages+"\nprice: "+price+"\n---------------------------------\n");
  }

  
  }
class lab_2 {
  public static void main(String[] args) {
   
    Scanner s=new Scanner(System.in);
int n=s.nextInt();
 Book b1[]=new Book[n];
for(int i=0;i<n;i++){
b1[i]=new Book();
 System.out.print("enter the name of the book: ");
    String name=s.nextLine();
    System.out.print("enter the author's name: ");
    String author=s.nextLine();
    System.out.print("enter the number of pages in the book: ");
    int  num_pages=s.nextInt();
    System.out.print("enter the price of the book: ");
    double price=s.nextDouble();
    System.out.println();
    b1[i].set_data(num_pages,price,name,author);}
   for(int i=0;i<n;i++)
b1[i].get_data();

    s.close();        
    
  }



}