public class MainTask4 {
    public static void main(String args[]) {
        int sum = 0;
        int mno = 1;
        for (int i = 0; i < args.length; i++) {
            String[] str = args[i].split("\\s");
            for(int j = 0; j < str.length; j++){
                int a=0;
                a=Integer.decode(str[j]);
                sum+=a;
                mno *= a;
            }
        }
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Произвидение элементов: " + mno);
    }
}
