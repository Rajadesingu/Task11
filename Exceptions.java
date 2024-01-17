package task11;

public class Exceptions {
	
	
	    public Exceptions(String message) {
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) {
	        try {
	           
	            int[] numbers = {1, 2, 3};
	            int result = numbers[5]; 
	            System.out.println("Array Result: " + result); 
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
	        }

	        try {
	            
	            String text = "Hello";
	            char charResult = text.charAt(10); 
	            System.out.println("String Result: " + charResult); 
	        } catch (StringIndexOutOfBoundsException e) {
	            System.err.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
	        }
	    }

		public String getMessage() {
			// TODO Auto-generated method stub
			return null;
		}
	}



