import java.util.Scanner;

public class Git13 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = a.nextDouble();

        System.out.print("Введите значение y: ");
        double y = a.nextDouble();
        double z = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
        System.out.println("Значение функции z =" + z);
    }
}