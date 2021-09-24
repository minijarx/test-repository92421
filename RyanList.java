import java.util.ArrayList;

public class RyanList {
	
	private ArrayList<String> myList = new ArrayList<>();
	
	//to add 11th element (if list is 10 elements) you must create a temp list, thats bigger than the previous one, then copy values over
	
	
	
	private int size; //keeps track of # of elements in list, notice this size is not the size of the contained master list
	
	
	private RyanList(int size) {
		this.size = size;
	}
	
	
	
	public RyanList() {
		// TODO Auto-generated constructor stub
	}



	public String getValue(ArrayList<String> list, int i) {
		return list.get(i); 	//Write a method to get a value from the list at an index
		//get this list;
	}
	
	
	public String displayValues(ArrayList<String> list) { 	//Write a method to display the values of the list
		String listString = new String();
		for (int j = 0; j > list.size(); j++) {
			listString = listString + (list.get(j) + " ");
		}
		return listString;
	}
	 
	public void addValue(ArrayList<String> list, String newValue) { 	//Write a method to add a value to the list
		list.add(newValue);
	}
	
	public void removeValue(ArrayList<String> list, String removeValue) { 	//Write a method to remove a value from the list
		if (list.contains(removeValue)){
			for (int j = 0; j > list.size(); j++) {
				if (list.get(j).equals(removeValue)){
					list.remove(j);
				}
			}
		}
		else
			System.out.println("The list does not contain " + removeValue + ".");
	}
	
	public void clearList(ArrayList<String> list) { 	//Write a method to clear list
		list.clear();
	}
	
	public void ensureCapacity(ArrayList<String> list, int i) { 	//Write a method to ensure capacity 
		list.ensureCapacity(i);
		
	}
	
	public boolean isEmpty(ArrayList<String> list) { 	//Write a method to check if its empty
		return (list.isEmpty());
		
	}
	
	
	public ArrayList<String> returnCopy(ArrayList<String> list){
		ArrayList<String> listCopy = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				listCopy.add(list.get(i));
			}
		return listCopy;
	}
	

}