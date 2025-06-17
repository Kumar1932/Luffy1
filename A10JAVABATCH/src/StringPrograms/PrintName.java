package StringPrograms;

import java.util.Scanner;

public class PrintName 
{
	public static void main(String[] args) throws InterruptedException 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("give name");
	 String s = sc.next();
	 for(int i=0;i<5;i++)
	 {
	  System.out.println(s);
	  Thread.sleep(3000);
	 }
	}
}
