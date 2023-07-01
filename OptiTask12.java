import java.util.Scanner;
public class OptiTask12 {
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
        for (int i =0;i<n-1;i++){
            for(int j = 0; j < n-1-i;j++){
                if(array[j+1]<array[j]){
                    int swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;
                }
            }
        }
        for(int i = 0;i<n;i++){
            System.out.print(array[i] + " ");
        }
    }
}