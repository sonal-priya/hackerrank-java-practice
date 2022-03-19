import java.util.Scanner;

public class Series {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a+b;
            System.out.print(sum);
            for(int j=1; j<n; j++){
                int series = (int)Math.pow(2,j);
                System.out.print(" "+(sum+series*b));
                sum +=Math.pow(2,j)*b;
            }
            System.out.print("\n");
        }
        in.close();
    }
}
