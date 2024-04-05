package tasks;
import java.util.Scanner;

/**
 * This class provides a method to compute the binomial coefficient "n choose k" using recursion.
 */
public class NinethProblem {

    /**
     * Main method to compute and print the binomial coefficient "n choose k".
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binomialCoef(n, k));
    }

    /**
     * Computes the binomial coefficient "n choose k" using recursion.
     *
     * This method has a time complexity of O(2^n), where n is the value of the larger parameter between n and k.
     * The method recursively calculates the binomial coefficient by summing the result of two recursive calls:
     * one for selecting the current element in the combination (i.e., "n - 1 choose k - 1") and one for excluding
     * the current element (i.e., "n - 1 choose k"). Each invocation of the method results in two recursive calls,
     * leading to exponential growth in the number of recursive calls and time taken.
     *
     * @param n The total number of items.
     * @param k The number of items to choose.
     * @return The binomial coefficient "n choose k".
     */
    public static long binomialCoef(int n, int k){
        if (k == 0 || n == k)
            return 1;
        else
            return binomialCoef(n - 1, k - 1) + binomialCoef(n - 1, k);
    }
}
