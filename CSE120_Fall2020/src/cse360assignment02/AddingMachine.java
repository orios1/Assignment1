package cse360assignment02;

public class AddingMachine {


	// private instance variable
	private int total;
	private String history;

	// constructor, initializes the instance variable
	public AddingMachine() {
		total = 0; // not needed - included for clarity
		history = "0";
	}
	
	 public static void main(String[] args) {
		 
		 // TESTING
		 
		// this statement creates an AddingMachine class object
		AddingMachine addMachine = new AddingMachine();

		addMachine.add(4); // calls add()

		addMachine.subtract(2); // calls subtract()

		addMachine.add(5);

		System.out.println(addMachine.toString());

		System.out.println("Total = " + addMachine.getTotal());

		addMachine.clear();

		System.out.println(addMachine.toString());

		System.out.println("Total = " + addMachine.getTotal());

		// TESTING COMPLETE: SUCCESSFUL
	}

	public int getTotal() { // returns the value of total
		
		return total;
	}

	public void add(int value) { // adds the parameter value to total & updates history
		
		total += value;
		history += " + " + value;
	}

	public void subtract(int value) { // subtracts the parameter value from total & updates history
		
		total -= value;
		history += " - " + value;
	}

	public String toString() { // returns the history String
		
		return history;
	}

	public void clear() { //restarts all the variables to their initial value
		
		total = 0;
		history = "0";
	}

} // End of AddingMachine.java file
