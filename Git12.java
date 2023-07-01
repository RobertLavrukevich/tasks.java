import java.util.Scanner;
public class Git12 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        double a = x.nextDouble();

        System.out.print("Введите значение b: ");
        double b = x.nextDouble();

        System.out.print("Введите значение c: ");
        double c = x.nextDouble();
        double y = (b + Math.sqrt(b * b + 4 * a * c))/(2*a)-Math.pow(a,3)* c + Math.pow(b,-2);
        System.out.println("Значение функции y = " + y);
    }
}