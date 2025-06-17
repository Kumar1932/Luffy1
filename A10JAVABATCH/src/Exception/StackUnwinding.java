package Exception;

public class StackUnwinding 
{
 static void disp4()
  {
	System.out.println(1/0);
  }
 static void disp3()
 {
	disp4();
 }
 static void disp2()
 {
	disp3();
 }
 static void disp1()
 {
	disp2();
 }
 public static void main(String[] args) 
 {
	System.out.println("Hi");
	try
	{
		disp1();
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
	System.out.println("Bye");
 }
}
