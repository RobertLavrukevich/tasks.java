import java.util.Scanner;

public class OptiTask1_1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во чисел: ");
        int n = scanner.nextInt();
        int nums[] = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Введите элемент: ");
            nums[i] = scanner.nextInt();}

        for(int i = 0; i < n; i++){
        System.out.println(nums[i]);
        }





    }
}
