package fizzbuzz;

public class fizzbuzz {

	public static void main(String[] args){
		
		//FizzBuzzBang
		//test if 3 is cleanly divisible - replace w/ fizz
//		test if 5 is cleanly divisible - replace w/ buzz
//      test if 7 is cleanly divisible - replace w/ bang
		
		for (int i = 1; i <= 110; i++){
			if (((i % 3) == 0) && ((i % 5) == 0) && ((i % 7) == 0)); 
			{
				System.out.println("FizzBuzzBang");
				}
			if(((i % 3) == 0) && ((i % 5) == 0)) 
			{
				System.out.println("FizzBuzz");
			}
			else if (((i % 5) == 0) && ((i % 7) == 0))
				System.out.println("BuzzBang");
			
			else if (((i % 5) == 0) && ((i % 7) == 0))
				System.out.println("FizzBang");
			
			else if ((i % 3) == 0){
				System.out.println("Fizz");
			}
			else if ((i % 5) == 0){
				System.out.println("Buzz");
			}
			else if ((i % 7) == 0){
				System.out.println("Bang");
				
				System.out.println(i);
				
			
			
			
		}
			
		}
}}
