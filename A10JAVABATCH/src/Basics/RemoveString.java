package Basics;

public class RemoveString 
{
public static void main(String[] args) 
{
	String[] arr= {"A","B","A","B","C","D"};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i].equals(arr[j]))
			{
				arr[j]="d";
			}
		}
	}
	for(int k=0;k<arr.length;k++)
	{
		if(arr[k]!="d")
		{
		System.out.println(arr[k]);
		}
	}
}
}
