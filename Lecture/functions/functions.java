import java.util.Scanner;

public class functions {
    static int addNumbers(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(addNumbers(a, b));

    }
}
