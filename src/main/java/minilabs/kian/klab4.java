package minilabs.kian;
import java.util.Scanner;


public class klab4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Shut Up.");

        String fib = input.nextLine();

        int fnum = Integer.parseInt(fib);

        int num1 = 0, num2 = 1;

        int count = 0;

        while (count < fnum) {
            System.out.println(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            count++;

        }
        int next = count + 1;

        System.out.println("No. " + count);
        System.out.println("No." + next + "No." + num1);
    }

}
