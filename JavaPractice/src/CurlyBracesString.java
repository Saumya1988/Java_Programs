
public class CurlyBracesString 
{

	public static void main(String[] args) 
	{
		String s= "{{{{}}}}";
String s1="}{}}{}}{}}";
for (int i=0;i<s.length()-1;i++)
{
	for(int j=s.length()-1;j>0;j--)
	{
		if(s.charAt(i)==s.charAt(j))
		{
			System.out.println("Valid string");
		}
		else 
			System.out.println("invalid String");
	}
	
}
	}

}
