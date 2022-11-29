/* Задача: Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, 
например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет */

import java.util.Scanner;

public class Task4Equals {
    public static void main(String[] args) {
        String num1;
        String num2;
        int sum;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Введите первое число:");
        num1 = input.nextLine();
        System.out.println("Введите второе число:");
        num2 = input.nextLine();
        System.out.println("Введите сумму этих чисел:");
        sum = input.nextInt();
        input.close();

        int indexNum1X = 0;
        int indexNum2X = 0;
        boolean flag = false;

        for (int i=0; i<num1.length(); i++) {
            if (num1.charAt(i) == '?') {
                indexNum1X = i;
            }
        }

        for (int m=0; m<num2.length(); m++) {
            if (num2.charAt(m) == '?') {
                indexNum2X = m;
            }
        }

        for (int i=0; i<10; i++) {
            for (int j=0; j<10; j++) {
                int n1 = Integer.parseInt(num1.substring(0, indexNum1X) + i + num1.substring(indexNum1X+1));
                int n2 = Integer.parseInt(num2.substring(0, indexNum2X) + j + num2.substring(indexNum2X+1));
                if (n1 + n2 == sum) {
                    System.out.println("Результат вычисления:");
                    System.out.println(n1 + "+" + n2 + "=" + sum);
                    flag = true;
                    break;
                }
                if (flag == true) {
                    break;
                }
            }
            if (flag == true) {
                break;
            }
        }
        if (flag == false) {
            System.out.println("Решение отсутствует");
        }
    }
}