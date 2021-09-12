package minilabs.billy;

public class blab2 {
    private String rank;

    public blab2(int ties, int wins, int losses) {
        String stats = "Your team has " + ties + " ties, " + wins + " wins, and " + losses + " losses.";
        System.out.println(stats);
        if (losses == 0) {
            System.out.println("Your team is destroying the competition!");
        }
        else if (losses < 3) {
            System.out.println("Your team is doing alright!");
        }
        else if (losses < 5) {
            System.out.println("Your team isn't doing very good.");
        }
        else {
            System.out.println("Your team sucks. Wow.");
        }


    }

    private String rankings(
            int ties,
            int wins,
            int losses){
        int statsList[];
        String stats = "Your team has " + ties + " ties, " + wins + " wins, and " + losses + " losses.";
        System.out.println(stats);
        if (losses == 0) {
            System.out.println("Your team is destroying the competition!");
        }
        else if (losses < 3) {
            System.out.println("Your team is doing alright!");
        }
        else if (losses < 5) {
            System.out.println("Your team isn't doing very good.");
        }
        else {
            System.out.println("Your team sucks. Wow.");
        }

        return stats;
    }

    //public static void main(String[] args){
    //rankings(0, 1, 8);
    //rankings(1, 3, 4);
    //rankings(3, 5, 1);
    //rankings(16, 32, 0);

    //}
}
