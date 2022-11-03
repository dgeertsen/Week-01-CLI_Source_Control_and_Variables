//Test 1
public class Tester {//this is the start of the class

	public static void main(String[] args) {//this is the main method
		// TODO Auto-generated method stub
		/*
		 * This is a block comment
		 */
		/*
		 * System.out.println("Hello World!"); //literals
		 * System.out.println("Hello Devon!"); //Lets talk variables //Variables reserve
		 * memory for certain values to be used later int a; //declaration a = 5;
		 * //initialization int b = 10; //single line D & I
		 * 
		 * //numeric primitives byte c = 12; short d =34; int e = 736434; //primary
		 * usage long f =13456777;
		 * 
		 * //floating point variables float g = 12.34f; double h = 67;//primary usage
		 * 
		 * System.out.println(h); //variables dont need quotes
		 * 
		 * int z =5, y=7; int x=z+y;
		 * 
		 * double bill = 45.6, sill =90.55; double gill = bill+sill;
		 * 
		 * int xx = x+(int)gill; //truncation System.out.println(x);
		 * System.out.println(gill); System.out.println(xx);
		 */
		int a =20, b = 28;
		//standard operators
		//addition
		/*
		 * System.out.println(a+b); //subtraction System.out.println(a-b);
		 * //multiplication System.out.println(a*b); //division System.out.println(a/b);
		 * //division casted, gives decimal places System.out.println((double)a/b);
		 * //modulus, gives remainder System.out.println(b%a);
		 */
		
		
		//compound operators
		int x =5;
		//addition
		x =x+5;
		System.out.println(x);
		//subtraction
		x =x-5;
		System.out.println(x);
		//Multiplication
		x =x*5;
		System.out.println(x);
		//division
		x =x/5;
		System.out.println(x);
		//modulus
		x =x%5;
		System.out.println(x);
		
		//incremental
		x++;
		
		//decremental   
		x--;
		
		//conditional operators
		//< less than, > greater than, 
		//<= less than or equal, >= greater than equal to, 
		//== equal, != not equal.
		
		//variables...sort of what do char and int have in common? 
		char myInitial = 'M';
		
		String myName = "Devon Geertsen";
		System.out.println(myName.toUpperCase());
				
	}
}
