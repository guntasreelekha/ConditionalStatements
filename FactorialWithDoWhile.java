package conditionaloperators;

public class FactorialWithDoWhile {
    public static void main(String args[]) {
        int f = 1, i = 1;
        do {
            f = (f * i);
            System.out.println("value:" + f);
            i++;
        } while (i <= 5);
    }
}
