//import java.util.*;
public class recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance, double guess){
      if ((guess * guess)/n > n * tolerance){
        //double guess = ( n / 1 + 1) / 2;
        //while(guess > ((n*n)*tolerance)){
          return sqrt(n, tolerance, (( n / guess + guess) / 2));
        }
        return 0;
    }


    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fibhelper(int end, int prev, int current){
      if(end == 0){
        return prev;
      } else if(end == 1){
        return current;
      }else{
        return fibhelper(end - 1 , current, current + prev);
      }
    }


    public static int fib(int n){
      if(n != 0 && n != 1){
        return fib(n-1) + fib(n-2);
      }
      return n;
    }

    /*As Per classwork*/
    //public static ArrayList<String> makeAllSums(int index, ArrayList<Integer> nums, ArrayList<String> sums){
        //if(index < nums.length){
        //  return groupSum(index + 1, nums, sums.add(nums[index] + "")) || groupSum(index + 1, nums, sums.add(nums[index] + ""));
      //  }
      //  return sums;
    //  }


    public static boolean canMakeSum(int index, int[] ary, int targetSum){
      if(index < ary.length){
        return canMakeSum(index + 1, ary, targetSum - ary[index]) || canMakeSum(index + 1, ary, targetSum);
      }
      return (targetSum == 0);
    }

    public static void main(String[] args) {
	     System.out.println(sqrt(100, 0.001, 1));
       System.out.println(fibhelper(5,0,1));
}

}
