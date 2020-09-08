package conditionalstatements;

public class Continue {
    public static void main(String args[]) {
        int num[] = {1, 2, 3, 4};
        for (int n = 1; n <= 4; n++) {
            if (n == 3) {
                continue;
            }
            System.out.println("The value of n :" + n);
        }
    }
}
