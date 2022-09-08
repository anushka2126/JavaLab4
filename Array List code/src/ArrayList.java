import java.util.Scanner;
// this code is to print the numbers using array list up to user print 0 and isolate odd number
public class ArrayList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int element=Integer.MAX_VALUE;
		
		ArrayList<Integer> list = new ArrayList<>();//Array list
		
		
		ArrayList<Integer> oddList = new ArrayList<>();	//Arraylist for odd  numbers
		
		// to print message to the user
		System.out.println("Enter elements of the ArrayList");
		System.out.println("When you will press 0 \nYour program stops");
		
		while(element!=0)
		{
			element = in.nextInt();
			list.add(element);
		
		}
		
		
		for(int i=0;i<list.size();i++)//Finding numbers from list to put them in oddList
		{
			if(list.get(i)%2!=0)
			{
				oddList.add(list.get(i));
			}
		}
		
		
		if(oddList.isEmpty())
			System.out.println("No element is odd in the entered list");//Printing odd Numbers using lambda expression 
		else
			oddList.forEach(a->System.out.println(a));
	}

}