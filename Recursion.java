//import java.util.*;
public class Recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      if (n > 0){
        double guess = ( n / 1 + 1) / 2;
        while(guess > ((n*n)*tolerance)){
          guess = sqrt((( n / guess + guess) / 2), tolerance);
        }
        return guess;
      }
      return 0;
    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return 0;
    }

    /*As Per classwork*/
    //public static ArrayList<Integer> makeAllSums(){

    //}

    public static void main(String[] args) {
	     System.out.println(sqrt(100, 0.001));
}

}
