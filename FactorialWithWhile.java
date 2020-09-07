package conditionaloperators;

public class FactorialWithWhile {
    public static void main(String args[]) {
        int f = 1, i = 1;
        while (i <= 5) {
            f = (f * i);
            i++;
        }
        System.out.println("value:" + f);
    }
}
