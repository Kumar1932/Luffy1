package Exception;

public class InstaPassword 
{
  static void login() throws PasswordException
  {
	  String Apwd="Kumar@1234";
	  String Epwd="Kumar@2345";
	  if(Apwd==Epwd)
	  {
		  System.out.println("Login succsessfully");
	  }
	  else
	  {
		  throw new PasswordException("Invalid Password");
	  }
  }
  public static void main(String[] args) 
  {
	try
	{
	login();
	}
	catch(PasswordException e)
	{
		System.out.println(e.getpwd());
	}
  }
}
class PasswordException extends Exception
{
	String pwd;
	PasswordException(String pwd)
	{
		this.pwd=pwd;
	}
	public String getpwd()
	{
		return pwd;
	}
}
