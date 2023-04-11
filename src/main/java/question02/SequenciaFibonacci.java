package question02;

import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {

    }
    public static boolean isFibonacci(int num) {
        int a = 0;
        int b = 1;
        while (a <= num) {
            if (a == num) {
                return true;
            }
            int temp = a;
            a = b;
            b = temp + b;
        }
        return false;
    }
}
