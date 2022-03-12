import java.util.Scanner;

public class ReadingNewLine {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine(); //this line is required because cursor is still at line 9 and nextLine() starts reading from there itself.
                        //line 10 reads the rest of the line of input (newline character after the double token, which is default delimiter for scanner.
        String s = scan.nextLine(); //line 10 consumes the empty new line, which is part of the double token, and cursor moves at line 12

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}
