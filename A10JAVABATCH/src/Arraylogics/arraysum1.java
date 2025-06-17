package Arraylogics;

public class arraysum1 
{
	public static void main(String[] args) 
	{
		int[] arr= {10,21,30,41};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
      System.out.println(sum);
	}
}
