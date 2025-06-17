package StringPrograms;

public class FindRepetative 
{
public static void main(String[] args) 
{
 String S="Hi my name kumar kumar";
  String[] arr=S.split(" ");

  for(int i=0;i<arr.length;i++)
  {
	  int count=0;
	  for(int j=i+1;j<arr.length;j++)
	  {
		  if(arr[j].equals(arr[i]))
		  {
			 count++; 
		  }
		
	  }
	  if(count>0)
	  {
		 System.out.println(arr[i]);
	  } 
  }
  
}
}
