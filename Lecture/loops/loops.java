package lecture.loops;

public class loops {
    static void forLoop(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }

    static void whileLoop(int x) {
        int i = 1;
        while (i <= x) {
            System.out.println(i);
            i++;
        }
    }

    static void doWhile(int x) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= x);
    }

    public static void main(String[] args) {
        forLoop(6);
        whileLoop(6);
        doWhile(6);
    }
}
