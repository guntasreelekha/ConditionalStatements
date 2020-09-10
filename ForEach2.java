package conditionalstatements;

public class ForEach2 {
    public static void main(String args[]) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        //for (int x=0;x<=10;x++)
        for (int x : num) {
            if (x == 5)
                continue;
            System.out.println("The value of x : " + x);
            sum += x;
        }
        System.out.println("The sum of numbers : " + sum);
    }
}
