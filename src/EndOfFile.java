import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        while(sc.hasNext()){
            counter++;
            String line = sc.nextLine();
            System.out.println(counter + " " +line);
        }
        sc.close();
    }
}
