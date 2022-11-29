// Задача: Реализовать простой калькулятор

// Задача: Реализовать простой калькулятор

import java.util.Scanner;

public class Task3SimpleCalc {
    public static void main(String[] args) {
        double num1;
        double num2;
        char operator;
        double answer;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число:");
        num1 = input.nextDouble();
        System.out.println("Введите второе число:");
        num2 = input.nextDouble();
        System.out.println("Введите оператор (*, /, +, -):");
        operator = input.next().charAt(0);
        input.close();

        switch (operator) {
            case '+': 
                {answer = num1 + num2;
                break;}
            case '-':  {answer = num1 - num2;
                break;}
            case '/':  {answer = num1 / num2;
                break;}
            case '*':  {answer = num1 * num2;
                break;}
            default:
                {System.out.printf("Некорректный оператор");
                return;}
        }
        System.out.println("Результат вычисления:");
        System.out.println(answer);
        
    }
}