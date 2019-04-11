
public class ReverseString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//reverse string "madam"
		
		String s="madam";
		String m="";
		for(int i=s.length()-1;i>0;i--)
				{
			m=m+s.charAt(i);
			
			
				}
		System.out.println(m);
	
		if (s.equals(m))
		
			System.out.println("palandrome");
		
		else 
			System.out.println("Not palandrome");
		
	
	}
}
