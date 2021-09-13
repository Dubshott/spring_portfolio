package minilabs.billy;

public class blab2 {
    private String rank;

    public blab2(int powerlvl, int health, int weakness) {
        String stats = "Your anime characte has " + powerlvl + " powerlvl, " + health + " health, and " + weakness + " weakness.";
        System.out.println(stats);
        if (weakness == 0) {
            System.out.println("Your anime character is destroying the competition!");
        }
        else if (weakness < 3) {
            System.out.println("Your anime characte is doing alright!");
        }
        else if (weakness < 5) {
            System.out.println("Your anime characte isn't doing very good.");
        }
        else {
            System.out.println("Your anime characte sucks. Wow.");
        }


    }

    private String rankings(
            int powerlvl,
            int health,
            int weakness){
        int statsList[];
        String stats = "Your anime characte has " + powerlvl + " powerlvl, " + health + " health, and " + weakness + " weakness.";
        System.out.println(stats);
        if (weakness == 0) {
            System.out.println("Your anime characte is destroying the competition!");
        }
        else if (weakness < 3) {
            System.out.println("Your anime characte is doing alright!");
        }
        else if (weakness < 5) {
            System.out.println("Your anime characte isn't doing very good.");
        }
        else {
            System.out.println("Your anime characte sucks. Wow.");
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
