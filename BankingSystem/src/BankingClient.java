import java.util.ArrayList;

public class BankingClient implements IBanking
{
	ArrayList<Customer> al=new ArrayList<Customer>(); 
			
			@Override
	public void add(Customer cust)
			{
		// TODO Auto-generated method stub
		al.add(cust);
		System.out.println(cust.name);
	}

	@Override
	public void findbyname() 
	{
		// TODO Auto-generated method stub
		
	}


}
