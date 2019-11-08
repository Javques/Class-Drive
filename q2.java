//--------------------------------------
// Assignment 3 (Q2)
// Written by: Alexis Bolduc 40126092
// For COMP 248 Section FF - Fall 2019
//--------------------------------------
//Welcome to question2 of assignment 3
//purpose: display the functionalities of the CPU class
public class q2 {

	public static void main(String[] args) {
		// declaration of two CPU object
		CPU cpu1 = new CPU();
		CPU cpu2 = new CPU(10, "i9", 449,3.1,"Q2'19",true);
	
		
		System.out.println("Welcome to the simple class example!\n");
		//output description of both objects
		System.out.println("CPU 1:" + cpu1);
		System.out.println("CPU 2:"+ cpu2);
		//output the series of CPU 1
		System.out.println("CPU 1 Series: "+ cpu1.getSeries());
		// output price of CPU
		System.out.println("CPU 1 Suggested price: "+String.format("%.2f USD",cpu1.getPrice()));
		// mutator call for price
		cpu1.setPrice(110);
		// output price after mutator
		System.out.println("CPU 1 Suggested price (after mutator call): "+ String.format("%.2f USD",cpu1.getPrice()));
		
		System.out.print("Are CPU 1 and CPU 2 equal? ");
		//output equality method value
		System.out.println(cpu1.equals(cpu2)?"YES":"NO");
		System.out.print("Is CPU 1 of highr generation than CPU 2? ");
		// output generation method value
		System.out.println(cpu1.isHigherGeneration(cpu2)?"YES":"NO");
		// output priceNow method for each of the CPU objects
		System.out.println("CPU 1 Price at Q3'19 :" + String.format("%.2f USD", cpu1.priceNow("Q3'19")));
		System.out.println("CPU 2 Price at Q3'19 :"+String.format("%.2f USD", cpu2.priceNow("Q3'19"))+"\n");
		//exit message
		System.out.println("Thank you for testing the simple class example!"); 
		
		
	}

}
//This marks the end of the program, thank you!
