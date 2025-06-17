package LogicalPrograms;

public class Tablesmwp 
{
 static void tables(int no)
 {
		for(int i=1;i<=10;i++)
		{
			System.out.println(no+"*"+i+"="+(no*i));
		}
		System.out.println();
 }
 public static void main(String[] args) 
 {
	tables(2);
	tables(3);
	tables(5);
 }
}
