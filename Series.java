package conditionalstatements;

public class Series {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                System.out.print("0");
            else
                System.out.print("1");
        }
    }
}
