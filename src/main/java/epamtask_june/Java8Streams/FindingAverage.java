package epamtask_june.Java8Streams;
import java.util.ArrayList;
import java.util.*;

public class FindingAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average avg = new Average();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to enter");
		int n= sc.nextInt();
		System.out.println("Enter numbers");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		System.out.println("Average of" + list + "is"+avg.findAverage(list));
		sc.close();

	}
	public static class Average
	{
		public Double findAverage(ArrayList<Integer> list)
		{
			OptionalDouble avg = list.stream().mapToInt(i->i).average();
			return avg.getAsDouble();
		}
	}

}
