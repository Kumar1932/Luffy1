package Basics;

public class Demo 
{
public static void main(String[] args) 
  {
	int star=1;
	int space=3;
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
			System.out.print("*");
		}
		star=star+2;
		space--;
		System.out.println();
	}
  }
}
