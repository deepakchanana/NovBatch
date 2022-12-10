package package1;

public class Class1 
{
   public Class1() 
   {
	System.out.println("default constructor");
   }
   
   public Class1(int a) 
   {
	   this();  // it will call default consturctor
	System.out.println("one parameterized constructor");
   }
   
   public Class1(int a,int b) 
   {
	   this(33);  // it will call one parameterized constructor
	System.out.println("two parameterized constructor");
   }
   
   public static void main(String[] args)
   {
	 Class1 ref=new Class1(45,444); // control will go to two parameterized
	
   }
}
