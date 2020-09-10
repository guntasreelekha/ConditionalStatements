package conditionalstatements;

public class FindPrime {
    public static void main(String args[]) {
        int num = 14;
        boolean prime;
        if (num < 2)
            prime = false;
        else
            prime = true;
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                prime = false;
                break;
            }
        }
        if (prime)
            System.out.println("The number is prime ");
        else
            System.out.println("The number is not prime");
    }
}
