 
public class PrintTheSem {

	public static void main(String[] args) {
		double i = 5;
		double j = 2; 
		double k = MAX(i, j);
		System.out.println( "The maximum between " + i + " and " + j + " is " +k);
	        Sum1(6,9);
		System.out.println( );   
		}

		public static double MAX(double num1, double num2) { 
			double result;
			if (num1 > num2) 
				result = num1;
			else result = num2; 
			return result;}   
		
		public static void Sum1(double a, double b){
			double sum1=0;
		sum1= a+b;
		System.out.println( "the sum is"+sum1);}

		
	

}


