package fr.unilim.iut.testgit;

public class HelloWorld {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Jouons ensembles");
        System.out.println( "Et si on jouait au FizzBuzz ?" );  
        System.out.println(FizzBuzz.getResult());
    }
	 public static class FizzBuzz {

		    public static String getResult() {
			    return "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz";
		    }
	 } 
}
