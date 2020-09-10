package conditionalstatements;

public class Comma {
    public static void main(String args[]) {
        int a, b;
        for (a = 0, b = 4; a < b; a++) {
            System.out.println("The value of a = " + a);
            System.out.println("The value of b = " + b);
            b--;
        }
    }
}
