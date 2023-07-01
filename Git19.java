import java.util.Scanner;
public class Git19 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Введите размер отверстия a: ");
        double a = p.nextDouble();
        System.out.print("Введите размер отверстия b: ");
        double b = p.nextDouble();

        System.out.print("Введите размер кирпича x: ");
        double x = p.nextDouble();
        System.out.print("Введите размер кирпича y: ");
        double y = p.nextDouble();
        System.out.print("Введите размер кирпича z: ");
        double z = p.nextDouble();

        if ((a * b == x * y) || (a * b == x * z) || (a * b == z * y)) {
            System.out.println("Кирпич пройдёт через отверстие");
        }
        else{
            System.out.println("Кирпич не пройдёт через отверстие");
        }
    }
}
