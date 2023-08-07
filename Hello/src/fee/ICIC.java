package fee;

public class ICIC implements Rbi,Rbi1
{

	public static void main(String[] args)
	{
	ICIC	i = new ICIC();
	        i.deposit();
	        i.withdrawl();

	}

	@Override
	public void withdrawl()
	{
	System.out.println(" i aom overriden withdrawl in icici");	
	}

	@Override
	public void deposit()
	{
		System.out.println(" i aom overriden deposit in icici");
		
	}

	@Override
	public void miniStatement()
	{
		
		
	}

}
