package fee;

public class HDFC  implements Rbi
{

	public static void main(String[] args)
	{
		HDFC   h = new HDFC();
		h.withdrawl();
		h.deposit(); 

	}

	@Override
	public void withdrawl()
	{
		
		System.out.println(" I AM OVERRIDDEN WITHDRAWL IN HDFC");
	}

	@Override
	public void deposit()
	{
		System.out.println(" I AM OVERRIDDEN DEPOSIT IN HDFC");

		
	}

}
