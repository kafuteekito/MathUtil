public class Main {
    public static void main(String[] args) {
        System.out.println("5 static methods:");

        // Static methods called directly
        System.out.println("Is 17 prime? " + MathUtil.isPrime(17));
        System.out.println("GCD of 56 and 21: " + MathUtil.gcd(56, 21));
        System.out.println("LCM of 72 and 11: " + MathUtil.lcm(72, 11));
        System.out.println("Fibonacci of 10: " + MathUtil.fibonacci(10));
        System.out.println("Factorial of 5: " + MathUtil.factorial(5));
        System.out.println("5 non static methods: ");

        System.out.println("\n5 non-static methods:");

        // Non-static methods require object creation

        MathUtil nonst = new MathUtil();

        System.out.println("Is 28 a perfect number? " + nonst.isPerfectNumber(28));
        System.out.println("Sum of digits of 1234: " + nonst.getSum(1234));
        System.out.println("Reversed number 6521: " + nonst.reverse(6521));
        System.out.println("Is 153 an Armstrong number? " + nonst.isArmstrong());
        System.out.println("Next prime after 214421: " + nonst.nextPrime(214421));
    }
}