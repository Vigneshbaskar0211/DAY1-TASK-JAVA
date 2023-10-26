package newfirstprogram;

public class SwapNumber {

	public static void main(String[] args) {
		
		float first = 10 , second = 30;

		System.out.println("--Before Swap--");
		System.out.println("First number is = " + first );
		System.out.println("Second number is = "  + second );

		
		float temprorary = first;
		
		first = second;
		
	    second = temprorary;
			
		System.out.println("-- After Swap--");
		System.out.println("First number is ="  + first );
		System.out.println("Second number is ="  + second );

	}

}




















