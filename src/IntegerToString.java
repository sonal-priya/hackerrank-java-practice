import java.util.Scanner;

public class IntegerToString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);67
        int n = sc.nextInt();
        sc.close();
        String s = Integer.toString(n);
        System.out.println("Integer " + n +" converted to String is " + s);
    }
}
