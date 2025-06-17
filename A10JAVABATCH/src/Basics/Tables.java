package Basics;

public class Tables 
{
   static void muggi(int no)
   {
	   for(int i=1;i<=10;i++)
	   {
		   System.out.println(no+"*"+i+"="+(i*no));
	   }
	   System.out.println();
   }
	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
			muggi(i);
		}
	}

}
