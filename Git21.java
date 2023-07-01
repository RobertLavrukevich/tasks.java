import java.util.Scanner;
public class Git21 {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);

        System.out.print("Введите кол-во элеметов массива: ");
        int n = p.nextInt();
        System.out.print("Введите коэф. кратности: ");
        int k = p.nextInt();

        int nums[] = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            System.out.print("Введите элемент: ");
            nums[i] = p.nextInt();}
        for(int i = 0; i < nums.length; i++){
            if (nums[i] % k == 0){
                sum += nums[i];
            }
        }
        System.out.println("Сумма элеметов кратных " + k + ":" + sum);
        }
}