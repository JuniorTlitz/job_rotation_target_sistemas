package question02;

import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isFibonacci(num)) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
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
