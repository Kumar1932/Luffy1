package StringPrograms;

import java.util.Scanner;

public class ScannerReverse2 
{
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("give string");
	 String s = sc.next();
	 String rev="";
	 for(int i=s.length()-1;i>=0;i--)
	 {
		 rev=rev+s.charAt(i);
	 }
	 System.out.println(rev);
	}
}
