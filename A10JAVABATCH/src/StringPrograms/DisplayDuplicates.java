package StringPrograms;

public class DisplayDuplicates 
{
public static void main(String[] args) 
{
 String s="Ranga";
 char[] arr = s.toCharArray();
 for(int i=0;i<arr.length;i++)
 {
    for(int j=i+1;j<arr.length;j++)
    {
    	if(arr[j]==arr[i])
    	{
    		System.out.print(arr[j]);
    		System.out.print(arr[i]);
    	}
    }
 }
}//it is wrong program
}
