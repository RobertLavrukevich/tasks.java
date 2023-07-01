import java.util.Scanner;
public class Git17 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Введите значение угла a: ");
        double a = x.nextDouble();

        System.out.print("Введите значение угла b: ");
        double b = x.nextDouble();

        if ((a < 180 && a > 0) && (b < 180 && b > 0))
            {
            if((a == 90) || (b == 90) || (180 - a - b == 90))
            {
                System.out.println("Треугольник прямоугольный");
            }
            else
            {
                System.out.println("Треугольник не прямоугольный");
            }
            }
            else
            {
            System.out.println("Неверные значения углов");
            }
    }
}
