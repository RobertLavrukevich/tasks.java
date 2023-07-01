import java.util.Scanner;
public class OptiTask11 {
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
        String max = null;
        int maxl = 0;
        int minl = array[0];
        String min = null;

        for (int i = 0; i < n; i++) {
            String c = Integer.toString(array[i]);
            if(maxl < c.length()){
                maxl = c.length();
                max = c;
            }
            else if (minl > c.length()) {
                minl = c.length();
                min = c;
            }
        }
        System.out.println("max: " + max);
        System.out.println("maximum number length: " + maxl);
        System.out.println("min: " + min);
        System.out.println("minimum number length: " + minl);

    }
}