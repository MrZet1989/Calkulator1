package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char oper;

        do {

            System.out.println("Выбирите нужную операцию и нажмите Enter: ");
            System.out.println("1.Сложение: +");
            System.out.println("2.Вычетание: -");
            System.out.println("3.Умножение: *");
            System.out.println("4.Деление: /");
            System.out.println("5.Возведение в степень: ^");
            System.out.println("6.Возведение в отрицательную степень: $");
            System.out.println("7.Выход: 0");

            oper = in.next().charAt(0);
            if (oper != '+' & oper != '-' & oper != '*' &
                    oper != '/' & oper != '^' & oper != '$' & oper != '0') {
                System.out.println("Ошибка");
                break;
            }

            var res = 0;
            switch (oper) {
                case '+': {
                    System.out.println("Введите первое число и нажмите Enter: ");
                    var a = in.nextInt();
                    System.out.println("Введите второе число и нажмите Enter: ");
                    var b = in.nextInt();
                    res = a + b;
                    System.out.println("Результат: " + res);
                    break;
                }
                case '-': {
                    System.out.println("Введите первое число и нажмите Enter: ");
                    var a = in.nextInt();
                    System.out.println("Введите второе число и нажмите Enter: ");
                    var b = in.nextInt();
                    res = a - b;
                    System.out.println("Результат: " + res);
                    break;
                }
                case '*': {
                    System.out.println("Введите первое число и нажмите Enter: ");
                    var a = in.nextInt();
                    System.out.println("Введите второе число и нажмите Enter: ");
                    var b = in.nextInt();
                    res = a * b;
                    System.out.println("Результат: " + res);
                    break;
                }
                case '/': {
                    System.out.println("Введите первое число и нажмите Enter: ");
                    var a = in.nextInt();
                    System.out.println("Введите второе число и нажмите Enter: ");
                    var b = in.nextInt();
                    res = a / b;
                    System.out.println("Результат: " + res);
                    if (a == 0)
                        System.out.println("На ноль делить нельзя");// проверка деления на 0
                    else if (b == 0)
                        System.out.println("На ноль делить нельзя");
                    break;
                }
                case '^': {
                    System.out.println("Введите число возводимое в степень и нажмите Enter: ");
                    var c = in.nextInt();

                    System.out.println("Введите степень числа и нажмите Enter: ");
                    var d = in.nextInt();
                    if (d <= 0) {
                        System.out.println("Ошибка");
                    }
                    var resStep = 1;

                    for (var i = 1; i <= d; i++) {
                        resStep *= c;
                    }

                    System.out.println("Число " + c + " в степени " + d + " равна = " + resStep);
                    break;
                }
                case '$': {
                    System.out.println("Введите число возводимое в степень и нажмите Enter: ");
                    var a = in.nextInt();

                    System.out.println("Введите степень числа и нажмите Enter: ");
                    var b = in.nextInt();
                    if (b <= 0) {
                        System.out.println("Ошибка");
                    }
                    var resStep = 1.0;

                    for (var i = 1; i <= b; i++) {
                        resStep /= a * resStep;
                    }

                    System.out.println("Число " + a + " в степени -" + b + " равна = " + resStep);
                    break;
                }
            }

        } while (oper != '0'); //для завершения программы
        System.out.println("Программа завршена!");
    }
}