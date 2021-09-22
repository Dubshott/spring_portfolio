package minilabs.billy;
import java.util.Scanner;

public class blab4 {

    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to fibonacci.How many numbers do you need?");

        String fib = input.nextLine();

        int fnum = Integer.parseInt(fib);

        int num1 = 0, num2 = 1;

        int count = 0;

        while (count < fnum) {

            // print the number
            System.out.print(num1 + " ");

            //Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            count = count + 1;
        }

        int next = count +1;
        System.out.print("It took " + count + " iterations of the while loop");
        System.out.print("the " + next + "th number of the fibinacci sequence is "+ num1);

    }
}
