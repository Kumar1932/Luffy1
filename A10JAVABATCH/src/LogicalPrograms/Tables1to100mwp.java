package LogicalPrograms;

public class Tables1to100mwp 
{
 static void tables(int no)
  {
	for(int j=1;j<=10;j++)
	{
		System.out.println(no+"*"+j+"="+(no*j));
	}
	System.out.println();
  }
 public static void main(String[] args) 
 {
	for(int i=1;i<=100;i++)
	{
		tables(i);
	}
 }
}
