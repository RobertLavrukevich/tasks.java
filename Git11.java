import java.util.Scanner;
public class Git11 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        double a = x.nextDouble();

        System.out.print("Введите значение b: ");
        double b = x.nextDouble();

        System.out.print("Введите переменной c: ");
        double c = x.nextDouble();

        double z = ((a - 3) * b / 2) + c;

        System.out.println("Значение функции z = " + z);

    }
}