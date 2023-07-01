import java.util.Scanner;
public class OptiTask13 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number of array elements: ");
        int n = x.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a number: ");
            int a = x.nextInt();
            array[i] = a;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String c = Integer.toString(array[i]);
            int b = c.length();
            sum+=b;
        }
        int pr = sum/n ;
        for (int i = 0; i < n; i++) {
            String c = Integer.toString(array[i]);
            int b = c.length();
            if(b > pr || b < pr){
                System.out.println(array[i] + " Lenght: " + b);

            }
        }

        System.out.println("Average: " + pr);
    }
}
