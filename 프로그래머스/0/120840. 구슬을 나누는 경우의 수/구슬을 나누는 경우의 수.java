import java.math.BigInteger;

class Factorial {
    public static BigInteger factorial(int n) {
        if (n == 0 || n == 1) {  // 0! = 1, 1! = 1
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1));  // n! = n * (n-1)!
    }
}

class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }

    public static int combination(int balls, int share) {
        if (balls == share || share == 0) return 1;
        return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
    }
}