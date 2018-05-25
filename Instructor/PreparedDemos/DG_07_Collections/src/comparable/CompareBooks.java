package comparable;

import java.util.Comparator;

public class CompareBooks implements Comparator<Object> {
	
	// Demo 7.19 - The Comparator Interface
	
	@Override
	public int compare(Object arg0, Object arg1) {

		Book book1= (Book) arg0;
		Book book2 = (Book) arg1;

		if (book1.getPrice() < book2.getPrice()){
			return -1;
		} else if (book1.getPrice() > book2.getPrice()){
			return 1;
		} else { //if this equals that
			return 0;
		}
	}
	
}
