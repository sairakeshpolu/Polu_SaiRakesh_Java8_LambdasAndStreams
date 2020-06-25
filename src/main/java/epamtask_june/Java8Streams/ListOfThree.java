package epamtask_june.Java8Streams;
import java.util.*;
import java.util.stream.*;

public class ListOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartsWithA obj = new StartsWithA();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings");
		int n=sc.nextInt();
		System.out.println("Enter strings");
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.next());
		}
		System.out.println("Strings starting with 'a' and has 3 characters are");
		List<String> res = obj.returnExpected(list);
		for(String s: res)
		{
			System.out.println(s);
		}
		sc.close();

	}
	public static class StartsWithA {
		public List<String> returnExpected(ArrayList<String> list)
		{
			List<String> res = list.stream().filter(s->(s.startsWith("a") && s.length()==3)).collect(Collectors.toList());
			return res;
		}
	}
}
