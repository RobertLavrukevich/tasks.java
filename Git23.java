import java.util.ArrayList;
import java.util.Scanner;

public class Git23 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner x = new Scanner(System.in);
        int countp = 0;
        int counto = 0;
        int countn = 0;
        System.out.println("Enter the number of array elements: ");
        int size = x.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter an array element: ");
            int num = x.nextInt();
            array.add(num);
        }
        for(int j = 0;j<array.size();j++){
            if(array.get(j) > 0)
                countp++;
            else if(array.get(j) < 0)
                countn++;
            else
                counto++;
        }
        System.out.println("Number of positive numbers: " + countp);
        System.out.println("Number of negative numbers: " + countn);
        System.out.println("Number of zeros: " + counto);
    }
}
