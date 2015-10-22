package Hoorcollege5;

public class PersoonlijkMain {

	public static void main(String args[]){
		System.out.println("test");
		int[] numArr = {1,2,3,4,5};
		System.out.println(sum(2,3,4,5));
		
		System.out.println(numArr);
		System.out.println(sum(numArr));
		
	}
	
	public static int sum(int...numbers)
	{
		int total = 0;
		for(int x:numbers)
		{
			total += x;
		}
		
		return total;
	}
}
