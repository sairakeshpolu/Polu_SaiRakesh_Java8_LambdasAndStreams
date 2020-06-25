package epamtask_june.Java8Streams;
import java.util.*;

public interface Palindromes {
		public List<String> returnPalindromes(ArrayList<String> list);
		
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of strings");
	int n=sc.nextInt();
	System.out.println("Enter strings");
	
	ArrayList<String> list = new ArrayList<String>();
	for(int i=0;i<n;i++)
	{
		list.add(sc.next());
	}
	
	Palindromes p = (ArrayList<String> lists)->
	{
		ArrayList<String> res = new ArrayList<String>();
		for(String s:lists)
		{
			String temp1 = s;
			StringBuilder sb  = new StringBuilder(s);
			String temp2 = sb.reverse().toString();
			if(temp1.equals(temp2))
			{
				res.add(temp1);
			}
		}
		return res;
	};
	System.out.println("Palindromes are"+p.returnPalindromes(list));
	sc.close();
}
}
