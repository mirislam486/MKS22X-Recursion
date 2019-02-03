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
    public static int fib(int n){ //Idk how to make this a tail recursive yet
      if(n != 0 && n != 1){
        return fib(n-1) + fib(n-2);
      }
      return n;
    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(ArrayList<Integer> nums,ArrayList<Integer> sums, int index){
      if(nums.length() > 0 && sums.length() < (nums.length) ^2){
        return makeAllSums(nums, sums.add(nums[index] + nums[index + 1]))
      }
    }

    public static void main(String[] args) {
	     System.out.println(sqrt(100, 0.001)); //currently returns a stack Overflow
}

}
