package tasks;
import java.util.Scanner;

/**
 * This class provides a method to compute the greatest common divisor (GCD) of two integers using recursion.
 */
public class TenthProblem {

    /**
     * Main method to compute and print the greatest common divisor (GCD) of two integers.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(a, b));
    }

    /**
     * Computes the greatest common divisor (GCD) of two integers using recursion.
     *
     * This method has a time complexity of O(log(min(a, b))), where a and b are the input integers.
     * The method recursively calculates the GCD using the Euclidean algorithm, which iteratively reduces
     * the problem size by taking the remainder of the larger number divided by the smaller number.
     * Each iteration reduces the problem size by approximately half, leading to logarithmic time complexity.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The greatest common divisor (GCD) of the two integers.
     */
    public static int GCD(int a, int b){
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }

}
