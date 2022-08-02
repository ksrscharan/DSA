package lecture.arrays;

import java.util.Scanner;

public class arrays {
    static void declareArray() {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println("2nd element in array is: " + arr[1]);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void arrayInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        sc.close();
    }

    public static void main(String[] args) {
        declareArray();
        arrayInput();
    }
}
