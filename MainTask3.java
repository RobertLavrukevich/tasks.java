import java.util.Random;
public class MainTask3 {
    public static void main(String args[]){
     int n = 5;
     Random random = new Random();
     for (int i = 0; i < n; i++){
         System.out.println(random.nextInt());
     }
        System.out.println();
     for (int i = 0; i < n; i++){
         System.out.print(random.nextInt());
     }

    }
}
