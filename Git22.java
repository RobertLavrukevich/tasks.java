import java.util.ArrayList;
import java.util.Scanner;

public class Git22 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner x = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the number of array elements: ");
        int size = x.nextInt();
        for(int i = 0;i<size;i++){
            System.out.println("Enter an array element: ");
            int num = x.nextInt();
            numbers.add(num);
        }
        System.out.println("Enter a number: ");
        int Z = x.nextInt();
        for(int j = 0;j<numbers.size();j++){
            if(numbers.get(j) > Z){
                numbers.set(j,Z);
                count++;
            }
        }
        System.out.println(numbers);
        System.out.println(count);
    }
}
