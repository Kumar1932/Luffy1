package Basics;

class Tester1
{
	int x;
	void disp()
	{
		System.out.println("Hi");
	}
}
class Huliyacha extends Tester1
{
	void bo()
	{
		System.out.println("Hello");
	}
}

public class Mainclass 
{
 public static void main(String[] args) 
  {
	Tester1 t=new Huliyacha();
	System.out.println(t.x);
	t.disp();
	Huliyacha h=(Huliyacha) t;
	System.out.println(h.x);
	h.bo();
	h.disp();
  }
}
