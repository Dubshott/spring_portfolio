package minilabs.kian;

import java.util.Scanner;

public class klab3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your name, height (inches) and vertical (inches)");

        // String input
        String name = myObj.nextLine();

        // Numerical input
        double height = myObj.nextDouble();
        double vertical = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Vertical: " + vertical);

        //Else0f Statements
        if(height >= 68 && vertical > 35){
            System.out.println("Ayo, "+ name + " You can dunk! Lets go!");
        }

        else if(height >= 60 && vertical > 45){
            System.out.println("Ayo, "+ name + " You can dunk! Lets go!")
            ;
        }

        else if(height <=60 && vertical < 45){
            System.out.println("YO, yo, yo, " + name + "You can't dunk, you trash as hell!");
        }

        else if(height >=68 && vertical <= 35){
            System.out.println("YO, yo, yo, " + name + "You can't dunk, you trash as hell!");
        }
    }
}


