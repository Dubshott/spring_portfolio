package minilabs;

public class blab1 {
    public static void main(String[] args){

        String name = "Billy";

        double MortGRADE;
        MortGRADE = 100.00;

        final int coolPercentage;
        coolPercentage = 100;

        boolean amicool;
        amicool = true;

        System.out.println(name + " has an average grade of " + MortGRADE + ".");

        System.out.println(name + " is " + coolPercentage + " out of 100 in coolness percentage.");

        System.out.println("Is " + name + " cool? " + amicool);

        System.out.println("");
        System.out.println("");

        int grade1 = 79;
        int grade2 = 80;
        int grade3 = 86;
        int grade4 = 94;
        int grade5 = 70;

        double avg1 = (grade1 + grade2)/2;
        double avg2 = (grade3 + grade4)/2;
        double avg3 = (avg1 + avg2 + grade5)/3;

        System.out.println("The Averages we got were " + avg1 + ", " + avg2 + ", and " + avg3 + ".");

    }}
