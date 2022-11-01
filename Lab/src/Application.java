
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *primitive
		 *int - an integer
		 *double - decimal places 32.8235
		 *float - precision decimal type 45.3987
		 *long - like an int, numbers can be higher
		 *short - like int but less num ranger
		 *byte - 8 bits of data
		 *char -  single character 
		 *boolean - true or false
		 * objects
		 * string - is textual data, a string of characters 
		 */
		
		//Variable deceleration - type, identifier, assignment operator, value semicolon
		int age = 31;
		double accountBalance = 34.67;
		char initial = 'M';
		boolean isHotOutside = false;
		String firstName = "Devon";
		String lastName = "Geertsen";
		System.out.println(age);
		System.out.println(accountBalance);
		System.out.println(initial);
		System.out.println(isHotOutside);
		System.out.println(firstName);
		
		//operator performs actions on different operands
		// + - * /
		age = age +1;
		System.out.println(age);
		
		String fullName = firstName + " " + lastName; //concatenation
		System.out.println(fullName);
		
		boolean isAge30 = age ==30;
		System.out.println(isAge30);
		
		boolean isAge32 = age ==32;
		System.out.println(isAge32);
		
		
		
	}

}
