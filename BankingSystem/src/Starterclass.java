import java.util.Scanner;

public class Starterclass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Customer cs=new Customer();
cs.ac.acc_no=101;
System.out.println(cs.ac.acc_no);
cs.ac.balance=1000;
System.out.println(cs.ac.balance);
cs.name="Saumya";
System.out.println(cs.name);
BankingClient bc=new BankingClient();
bc.add(cs);

	}

}
