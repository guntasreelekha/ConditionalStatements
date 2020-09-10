package conditionalstatements;

public class TernaryLargeNum {
    public static void main(String[] args) {
        int n1 = 5, n2 = 10, result;
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);
        result = (n1 > n2) ? (n1 + n2) : (n1 - n2);
        System.out.println("Result = " + result);
    }
}
