import java.util.Scanner;
public class Main {
    public static void Hard(double x, double y, double a, double b) {
        System.out.println("Высокий уровень: ");
        double K = (Math.sqrt((x + b - a)) + Math.log(y)) / Math.atan(b + a);
        System.out.println("Функция K = " + K);
    }
    public static void Medium(double x, double y) {
        System.out.println("Средний уровень: ");
        double L = (0.81 * Math.cos(x)) / Math.log(y) + 2 * Math.pow(x, 3);
        System.out.println("Функция L = " + L);
    }
    public static void Base(double x, double y) {
        System.out.println("Базовый уровень: ");
        double M = Math.cos(2*y) + 3.6 * Math.pow(Math.exp(1), x);
        System.out.println("Функция M = " + M);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: "); double x = in.nextDouble();
        System.out.print("Введите y: "); double y = in.nextDouble();
        Base(x, y);
        System.out.print("Введите y: "); y = in.nextDouble();
        System.out.print("Введите i: "); double i = in.nextDouble();
        Medium(i, y);
        System.out.print("Введите x: "); x = in.nextDouble();
        System.out.print("Введите y: "); y = in.nextDouble();
        System.out.print("Введите a: "); double a = in.nextDouble();
        System.out.print("Введите b: "); double b = in.nextDouble();
        Hard(x, y, a, b);
    }
}