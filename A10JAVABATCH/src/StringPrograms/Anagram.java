package StringPrograms;

import java.util.Arrays;

public class Anagram 
{
  public static void main(String[] args) 
  {
	String S1="dog";
	String S2="god";
	if(S1.length()==S2.length())
	{
		char[] abc=S1.toCharArray();
		char[] abd=S2.toCharArray();
		Arrays.sort(abc);
		Arrays.sort(abd);
		String S3=new String(abc);
		String S4=new String(abd);
		if(S3.equals(S4))
		{
			System.out.println("It is a anagram");
		}
		else
		{
			System.out.println("it is not a anagram");
		}
	}
	else
	{
		System.out.println("String is not anagram");
	}
  }
}
