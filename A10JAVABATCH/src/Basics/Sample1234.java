package Basics;

public class Sample1234 
{
	Sample1234(int a)
	{
	  System.out.println(a);
	}
	Sample1234(String b)
	{
		this(14);
		System.out.println(b);
	}
	Sample1234(int c,String d)
	{
		this("Bye");
		System.out.println(c+" "+d);
	}
public static void main(String[] args) 
{
	Sample1234 s=new Sample1234(14,"Hi");
}
}
