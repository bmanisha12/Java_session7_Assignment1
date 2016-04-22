
public class maincls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
				
try
{
	System.out.println("\n element at 7th position of array: "+arr[6]);
}
catch(ArrayIndexOutOfBoundsException a ){
	System.out.println("Alert! : you can't access elements out of array index range");
}
	}

}
