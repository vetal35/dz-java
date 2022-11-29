// Задача: Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;


public class Task1Triangle {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите значение n треугольного числа, которое необходимо вычислить: ");
        int n = iScanner.nextInt();
        iScanner.close();

        int tn = n * (n + 1) / 2;
        System.out.printf("Значение треугольного числа равно: %d\n", tn);
    }
}