package LogicalPrograms;

public class Tables1_100 
{
public static void main(String[] args) 
  {
	for(int i=1;i<=100;i++)
	{
	  int no=i;
	  for(int j=1;j<=10;j++)
	  {
		System.out.println(no+"*"+j+"="+(no*j));
	  }
	  System.out.println();
	}
  }
}
