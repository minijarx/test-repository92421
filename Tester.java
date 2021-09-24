import java.util.ArrayList;

public class Tester {
	//Test class by calling all hand written methods as I have done as an example in class
	public static void main (String[] args) {
		
		
		
		//ArrayList<String> myTempList = new ArrayList<>();
		ArrayList<String> myList = new ArrayList<>();
		RyanList rList = new RyanList();
		
		
		
		//System.out.println(rList.size());
		rList.addValue(myList, "Jerry");
		rList.addValue(myList, "Mark");
		System.out.println(rList.getValue(myList, 1));
		System.out.println(rList.displayValues(myList));
		rList.removeValue(myList, "Jerry");
		rList.removeValue(myList, "Bob");
		rList.clearList(myList);
		System.out.println(rList.isEmpty(myList));
		
		
	}
	
}

