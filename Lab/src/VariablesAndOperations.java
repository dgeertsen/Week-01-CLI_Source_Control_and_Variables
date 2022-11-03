
public class VariablesAndOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Seats on a plane
		int seatsLeft = 34;
		//Cost of groceries
		double foodCost = 34.45;
		//Middle initial
		char middleInitial = 'M';
		//temp outside
		boolean isItHotOutside = false;
		//Customers name and street address
		String firstName = "Devon";
		String streetAddress = "123 Cool Ave";
		
		System.out.println(seatsLeft);
		System.out.println(foodCost);
		System.out.println(middleInitial);
		System.out.println(isItHotOutside);
		System.out.println(firstName);
		System.out.println(streetAddress);
		
		//a customer booked 2 plane seats
		seatsLeft -= 2;
		
		//I bought more groceries 2.12 worth
		foodCost += 2.12;
		
		//change middle name
		middleInitial = 'P';
		
		//an hour has passed in mt. it is now hot
		isItHotOutside = !isItHotOutside;
		
		//Create a full name variable 
		String lastName = "Geertsen";
		String fullName = firstName + " "+middleInitial+" "+lastName;
		
		//print a line that introduces the customer and their address
		String finalLine = "My name is "+fullName+", I live at "+streetAddress;
		
		System.out.println(seatsLeft);
		System.out.println(foodCost);
		System.out.println(middleInitial);
		System.out.println(isItHotOutside);
		System.out.println(fullName);
		System.out.println(finalLine);
		
		
	}

}
