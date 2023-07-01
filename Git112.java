import java.util.Scanner;
public class Git112 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        System.out.print("Введите размер отверстия a: ");
        int a = p.nextInt();
        int sum = 0;
         for(int i = 1; i <= a; i++)
         {
             sum += i;
         }
        System.out.println("Сумма равна: " + sum);
    }
}