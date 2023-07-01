import java.util.Scanner;

public class MainTask1 {
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = a.nextLine();
        System.out.println("Привет " + name);
    }
}