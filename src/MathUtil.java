import java.math.*;

public class MathUtil {
    // for Armstrong

    /**
     * Calculate x raised to the power y.
     * This is used for calculating the sum of powers in the Armstrong number check.
     */
    int power(int x, long y)
    {
        if (y == 0)
            return 1;
        if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        return x * power(x, y / 2) * power(x, y / 2);
    }
    /**
     * Determine the number of digits in a number.
     * This is needed for Armstrong number calculation.
     */
    int order(int x)
    {
        int n = 0;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        return n;
    }

    // 5 static methods
    /**
     * Check if a number is prime.
     * Optimized to check up to the square root of the number, reducing time complexity.
     */
    public static boolean isPrime(int n)
    {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculate GCD of two numbers using the Euclidean algorithm.
     * Time complexity: O(log(min(a, b)))
     */
    public static int gcd(int a, int b)
    {
        int i = Math.min(a, b);

        for (i = i; i > 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }
        return 1;
    }

    /**
     * Calculate LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
     */
    public static int lcm(int u, int v)
    {
        return (u / gcd(u, v)) * v;
    }

    /**
     * Calculate the n-th Fibonacci number using recursion.
     * Time complexity: O(2^n) but could be optimized with dynamic programming.
     */
    public static int fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Calculate the factorial of a number.
     */
    public static int factorial(int n) {
        int res = 1, i;
        for (i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    // 5 nonstatic methods
    /**
     * Check if a number is a perfect number.
     * A perfect number is a number that is equal to the sum of its proper divisors.
     */
    public boolean isPerfectNumber(int n)
    {
        if (n == 1) {
            return false;
        }

        int sum = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }

    /**
     * Calculate the sum of digits of a number.
     */
    public int getSum(int n)
    {
        int sum = 0;
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }

        return sum;
    }

    /**
     * Reverse the digits of a number.
     */
    public int reverse(int n)
    {
        int rev = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }

        return rev;
    }

    /**
     * Check if a number is an Armstrong number.
     * An Armstrong number is one where the sum of its digits raised to the power of the number of digits equals the number itself.
     */
    boolean isArmstrong()
    {
        // Calling order function
        int n = order(153);
        int temp = 153, sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + power(r, n);
            temp = temp / 10;
        }

        return (sum == 153);
    }

    /**
     * Get the next prime number greater than the given number using BigInteger's nextProbablePrime.
     */
    public long nextPrime(long n)
    {
        BigInteger b = new BigInteger(String.valueOf(n));
        return Long.parseLong(b.nextProbablePrime().toString());
    }
}
