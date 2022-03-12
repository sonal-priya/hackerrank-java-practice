import java.util.Scanner;

public class StdInStdOut{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //close the scanner
        sc.close();

        System.out.println(a + "\n" + b + "\n" + c);
    }
}