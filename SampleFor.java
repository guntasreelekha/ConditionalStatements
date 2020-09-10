package conditionalstatements;

public class SampleFor {
    public static void main(String args[]) {
        int a, b = 4;
        for (a = 0; a < b; a++) {
            System.out.println("The value of a = " + a);
            System.out.println("The value of b = " + b);
            b--;
        }
    }
}
