package com.quiz.EqualSumChecker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        boolean result;
        result = hasEqualSum(1,2,2);
    	System.out.println( result );
    }
    
    public static boolean hasEqualSum (int one, int two, int three) {
    	
    	boolean result;
    	if (one + two == three)
    		result = true;
    	else result = false;
    	return result;
    		
    }
}
