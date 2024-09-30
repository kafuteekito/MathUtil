# Math Utility Library

This is a Java-based utility library that provides various mathematical functions. It includes both **static** and **non-static** methods to perform common mathematical operations like finding prime numbers, calculating GCD, Fibonacci, Armstrong numbers, etc.

## Features

- **Static Methods:**
  - Prime number check (`isPrime`)
  - Greatest Common Divisor (GCD) calculation (`gcd`)
  - Least Common Multiple (LCM) calculation (`lcm`)
  - Fibonacci sequence calculation (`fibonacci`)
  - Factorial calculation (`factorial`)

- **Non-Static Methods:**
  - Perfect number check (`isPerfectNumber`)
  - Sum of digits of a number (`getSum`)
  - Reverse a number (`reverse`)
  - Armstrong number check (`isArmstrong`)
  - Find the next prime number (`nextPrime`)

### Example Output:

```
5 static methods:
Is 17 prime? true
GCD of 56 and 21: 7
LCM of 72 and 11: 792
Fibonacci of 10: 55
Factorial of 5: 120

5 non-static methods:
Is 28 a perfect number? true
Sum of digits of 1234: 10
Reversed number 6521: 1256
Is 153 an Armstrong number? true
Next prime after 214421: 214429
```

## Methods Overview

### Static Methods:

1. **isPrime(int n)**: Returns `true` if the number `n` is prime, `false` otherwise.
2. **gcd(int a, int b)**: Computes the greatest common divisor of two numbers.
3. **lcm(int u, int v)**: Calculates the least common multiple of two numbers.
4. **fibonacci(int n)**: Finds the n-th Fibonacci number.
5. **factorial(int n)**: Returns the factorial of `n`.

### Non-Static Methods:

1. **isPerfectNumber(int n)**: Returns `true` if `n` is a perfect number.
2. **getSum(int n)**: Returns the sum of the digits of `n`.
3. **reverse(int n)**: Returns the reverse of the number `n`.
4. **isArmstrong(int n)**: Returns `true` if `n` is an Armstrong number.
5. **nextPrime(long n)**: Returns the next prime number greater than `n`.
