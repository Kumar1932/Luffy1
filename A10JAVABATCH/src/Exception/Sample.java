package Exception;

public class Sample 
{
 public static void main(String[] args) 
   {
	System.out.println("Hi");
	try
	{
		int a=3/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Hello");
	}
	System.out.println("Bye");
   }
}