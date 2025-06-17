package Arraylogics;

public class Remove {

	public static void main(String[] args) 
	{
		String[] arr= {"kumar","sumant","hemant","hemant"};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]="viraat";
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			if(arr[k]!="viraat")
			{
				System.out.println(arr[k]);
			}
		}
	}

}
