package question10;

public class Question10_06 {

	public static void main(String[] args) {
		for( int i = 1 ;i <= 100 ; i++ ){
			if( i % 15 == 0 ){
				System.out.println("FizzBuzz");	
			}else if(i % 5 == 0) {
				System.out.println("Buzz");	
			}else if(i % 3 == 0) {
				System.out.println("Fizz");	
			}else {
				System.out.println( i );
			}
			
			
		}

	}

}
