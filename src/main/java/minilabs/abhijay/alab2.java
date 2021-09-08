package minilabs.abhijay;

public class alab2 {
    static void rankings(int even, int profit, int loss){
        String stats = "Within your stocks, there were " + even + " times when you broke even, " + profit + " times you made profit, and " + loss + " times you lost money.";
        System.out.println(stats);
        if (loss == 0) {
            System.out.println("You never lost any money!");
        }
        else if (loss < 3) {
            System.out.println("You lost money a few times, but it's all good!");
        }
        else if (loss < 5) {
            System.out.println("You are losing too much money. Get better.");
        }
        else {
            System.out.println("Bro just stop. You are going to become homeless at this rate.");
        }


    }

    public static void main(String[] args){
        rankings(5, 2, 7);
        rankings(1, 7, 2);
        rankings(6, 1, 2);
        rankings(19, 91, 2);

    }
}

