import java.util.Scanner;
public class Git15 {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);

        System.out.print("Введите кол-во секунд: ");
        int t = p.nextInt();
        int ch = t / 3600;
        int min = (t - ch * 3600) / 60 ;
        int sec = (t - ch * 3600) % 60;

        System.out.println("Время: " + ch + "ч " + min + "мин " + sec + "c");
    }
}