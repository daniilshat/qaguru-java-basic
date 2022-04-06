package ru.daniilshat;
import java.util.Scanner;

public class Main {
    // Метод нахождения дискриминанта
    public static double discriminant(double a_1, double b_1, double c_1) {
        return (b_1 * b_1) - (4 * a_1 * c_1);
    }

    public static void main(String[] args) {
        double a, b, c;

        Scanner in = new Scanner(System.in);

        System.out.println("Для нахождения корней квадратного уравнения типа ax^2 +/- bx +/- c  введите числа.");
        System.out.println("Необходимо вводить строго целые числа.");
        System.out.println("------");

        // Поля ввода
        System.out.print("Введите a:");
        a = in.nextDouble();
        System.out.print("Введите b:");
        b = in.nextDouble();
        System.out.print("Введите c:");
        c = in.nextDouble();
        System.out.println("------");

        double d = discriminant(a, b, c);

        // Основная логика
        if (d < 0) {
            System.out.printf("Дискриминант меньше 0. Корней нет.", d);
        }
        else if (d == 0) {
            double answer = -b / 2 * a;
            int answerInt = (int)answer;
            System.out.printf("Ответ %d.", answerInt);
        }
        else if (d > 0) {
            double answer1 = (-b + Math.sqrt(d)) / (2 * a);
            int answerInt1 = (int)answer1;
            double answer2 = (-b - Math.sqrt(d)) / (2 * a);
            int answerInt2 = (int)answer2;
            System.out.printf("Два корня: %d и %d.", answerInt1, answerInt2);
        }
    }
}
