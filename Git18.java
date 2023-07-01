import java.util.Scanner;
public class Git18 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);

        System.out.print("Введите значение угла a1: ");
        double a1 = z.nextDouble();
        System.out.print("Введите значение угла b1: ");
        double b1 = z.nextDouble();

        System.out.print("Введите значение угла a2: ");
        double a2 = z.nextDouble();
        System.out.print("Введите значение угла b2: ");
        double b2 = z.nextDouble();

        System.out.print("Введите значение угла a3: ");
        double a3 = z.nextDouble();
        System.out.print("Введите значение угла b3: ");
        double b3 = z.nextDouble();

        if(((a1 == a2) && (a1 == a3) && (a2 == a3)) || ((b1 == b2) && (b1 == b3) && (b2 == b3))){
            System.out.println("Точки находятся на одной прямой");
        }
        else
        {
            System.out.println("Точки находятся не на одной прямой");
        }
    }
}