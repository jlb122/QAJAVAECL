package qa;

public class A_Methods {

	public static void main(String[] args) {
		
		int itemsBought = 5;
		double itemCost = 4.99;
		
		double price = calculateCost(itemsBought, itemCost);
		System.out.println("The items will cost: £" + price);
	}
	
	// Demo 4.01 - Methods with parameters
	public static double calculateCost(int numberOfItems, double costPerItem) {
		double cost = (numberOfItems * costPerItem);
		double totalCost = cost *= 1.2;  // Add VAT
		return totalCost;
	}

}
