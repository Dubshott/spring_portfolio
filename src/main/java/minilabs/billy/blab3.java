package minilabs.billy;
import java.util.Scanner;

public class blab3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your name, favorite Sports Team and thier Winning Percentage (0% - 100%)");

        // String input
        String name = myObj.nextLine();

        // Numerical input
        String favTeam = myObj.nextLine();
        double winPercentage = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Favorite Team: " + favTeam);
        System.out.println("winning Percentage: " + winPercentage);

        //Else0f Statements
        if(winPercentage > 50.0 && winPercentage <=75.0){
            System.out.println("Ayo, "+ name + " The the you support, " + favTeam + " is mid as hell!");
        }

        else if(winPercentage > 75.0){
            System.out.println("Ayo, "+ name + " The the you support, " + favTeam + " Is actually hella good!")
            ;
        }

        else if(winPercentage <=50.0){
            System.out.println("YO, yo, yo, " + name + " The the you support, " + favTeam + "Is downright horendous. Sorry for the L's you are taking");
        }


    }
}
