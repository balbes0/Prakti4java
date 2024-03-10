import java.util.Scanner;
abstract class Figure {
    public abstract double S();
    public abstract double P();
}
class Kvadrat extends Figure {
    private double a;
    public Kvadrat(double a) {
        this.a = a;
    }
    @Override
    public double S() {
        return a * a;
    }
    @Override
    public double P() {
        return 4 * a;
    }
}
class Treugolnik extends Figure {
    private double a, b, c;
    public Treugolnik(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double S() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    @Override
    public double P() {
        return a + b + c;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите номер фигуры:\n1. Квадрат\n2. Треугольник\n");
        int choice = scanner.nextInt();
        while (true) {
            if (choice == 1) {
                System.out.println("Введите длину стороны квадрата: ");
                double a = scanner.nextDouble();
                Kvadrat kvadrat = new Kvadrat(a);
                System.out.println("Площадь квадрата: " + kvadrat.S());
                System.out.println("Периметр квадрата: " + kvadrat.P());
                break;
            }
            else if (choice == 2) {
                System.out.println("Введите длины сторон треугоьника:");
                System.out.println("A: ");
                double a = scanner.nextDouble();
                System.out.println("B: ");
                double b = scanner.nextDouble();
                System.out.println("C: ");
                double c = scanner.nextDouble();
                Treugolnik treugolnik = new Treugolnik(a, b, c);
                System.out.println("Площадь треугольника: "+treugolnik.S());
                System.out.println("Периметр треугольника: "+treugolnik.P());
                break;
            }
            else {
                System.out.println("Некорректный ввод!");
                choice = scanner.nextInt();
            }
        }
    }
}