
public class Prime {

    static boolean isPrime(int number) {
        if (number < 0)
            return false;
        int numberOfDivisors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                numberOfDivisors++;
        }
        return numberOfDivisors == 2 ? true : false;
    }
}
