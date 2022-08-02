package lecture.strings;

import java.util.Scanner;

public class strings {
    static void printStatement(String s) {
        System.out.println(s);
    }

    static void declareString() {
        String s1 = "java";
        String s2 = new String("java");
        printStatement(s1);
        printStatement(s2);
    }

    static void inputString() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.nextLine();
        printStatement(s1);
        printStatement(s2);
        sc.close();
    }
    
    static void charAtMethod(String s, int i){
        System.out.println(s.charAt(i));
    }

    static void compareToMethod(String s1, String s2){
        System.out.println(s1.compareTo(s2));
    }

    static void substringMethod(String s, int i1, int i2){
        System.out.println(s.substring(i1, i2));
    }

    public static void main(String[] args) {
        declareString();
        inputString();
        charAtMethod("java", 2); 
        // v
        compareToMethod("java", "python");
        // -ve = s2 if big; +ve = s1 is big
        substringMethod("hello", 1, 3);
        // "el"
    }
}
