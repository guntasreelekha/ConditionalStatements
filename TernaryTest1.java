package conditionalstatements;

public class TernaryTest1 {
    public static void main(String args[]) {
        int a, b,c;
        a = 10;
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is : " + b);
        c = (a == 10) ? 20 : 30;
        System.out.println("Value of c is : " + c);
    }
}
