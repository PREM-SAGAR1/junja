package fee;

public interface Rbi
{
	int x =10;
	

	public void withdrawl();
	
	public void deposit();
	
	public static void main(String[] args)
	{
		Rbi i;
		i = new ICIC();
		i.deposit();
		i.withdrawl();
		
		i = new HDFC();
		i.deposit();
		i.withdrawl();
		
	}
	
}
