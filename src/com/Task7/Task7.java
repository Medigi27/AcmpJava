import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

    public static void main(String[] argv) throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int[] tab = {a, b, c};
        int max = Arrays.stream(tab).max().getAsInt();
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        if (a > 727 || a < 94 ) {
            pw.println("Error");
        }
        if (b > 727 || b < 94 ) {
            pw.println("Error");
        }
        if (c > 727 || c < 94 ) {
            pw.println("Error");
        }
        else {
            pw.print(max);
        }
        pw.close();

    }
}