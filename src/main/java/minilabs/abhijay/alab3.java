package minilabs.abhijay;

import java.util.Objects;
import java.util.Scanner;

public class alab3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your computer OS (Windows, Linux, MacOS, ChromeOS), your name, and phone model (ex: iphone 6 = 6)");

        // String input
        String comOS = myObj.nextLine();
        String name = myObj.nextLine();


        // Numerical input
        int model = myObj.nextInt();

        //2nd String input


        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Phone Model: " + model);
        System.out.println("comOS: " + comOS);

        //Else0f Statements
        if(Objects.equals(comOS, "Windows") || Objects.equals(comOS, "Linux") && model >= 8){
            System.out.println("Ayo, "+ name + " You are cultured! You are gonna succeed in this world");
        }

        else if(Objects.equals(comOS, "MacOS") || Objects.equals(comOS, "ChromeOS") && model >= 8){
            System.out.println("Ayo, "+ name + " You are somewhat cultured. Change your computer OS, becuase it aint superior")
            ;
        }

        else if(model <8){
            System.out.println("YO, yo, yo, " + name + " Don't even worry about the Computer OS, your phone model is trash as hell!");
        }

    }
}


