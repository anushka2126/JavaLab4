
//this is code for creating hash map whose keys are 1 to 15 and its value square of keys
public class  HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> numbers = new HashMap<>();// for adding value to the hashmap
	     numbers.put(9,4);
	     numbers.put(7,9);
	     numbers.put(3,12);
	     numbers.put(14,11);
	     for(int i=1;i<=15;i++)
	     {
	    	 if(numbers.containsKey(i))//function to display key
	    	 {
	    		 System.out.println(i+"Number which is  presnt in the list");
	    	 }
	    	 else
	    	 {
	    		 System.out.println(i+"Number which is not presnt in the list");
	    	 }
	     }
	     for(Integer i:numbers.keySet())
	     {
	    	 System.out.println("key:"+i+"value:"+numbers.get(i));// for printing square values
	     }
		}

	}