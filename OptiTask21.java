import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class OptiTask21 {
    public static void main(String[] args) {
        int mi=-9;
        int ma = 9;
        Scanner x = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of array elements: ");
        int n = x.nextInt();
        int[][] array = new int[n][];
        for (int i = 0; i < n; i++) {
            array[i] = new int[n];
        }
        array = Arrays.stream(array)
                .map(row -> Arrays.stream(row)
                        .map(item -> random.nextInt(mi,ma))
                        .toArray())
                .toArray(int[][]::new);
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                System.out.print(array[a][b] + " ");
            }
            System.out.println();
        }
        int max = array[0][0];
        int maxr = 0;
        int maxc = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxr = i;
                    maxc = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(maxr);
        System.out.println(maxc);
        int[][] array1 = new int[n-1][n-1];
        for (int i=0, ln=0; ln<n-1;) {
            if (i!=maxr) {
                for (int j=0, cn=0; cn<n-1; j++, cn++) {
                    if (j==maxc) j++;
                    array1[ln][cn]=array[i][j];
                }
                i++;
                ln++;
            } else i++;
        }
        array=array1;
        for (int a = 0; a < n-1; a++) {
            for (int b = 0; b < n-1; b++) {
                System.out.print(array1[a][b] + " ");
            }
            System.out.println();
        }
    }
}

