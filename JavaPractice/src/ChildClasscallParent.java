
public class ChildClasscallParent {
	public static void main(String[] args) 
	{
		//"Parent="ABCD"
		//Child="AB"
		String p="ABABABAB";
		String c="BA";
		char b1;
		String b2;
		
			for (int j=0;j<=c.length()-1;j++)
			{
				for (int i=0;i<=p.length()-1;i++)
				{
				
			if(c.charAt(j)==p.charAt(i))
					{
				System.out.println("match found");
				 b1= c.charAt(j);
				System.out.println(b1);
				
					}
			
				
			}
		}
	}
}
