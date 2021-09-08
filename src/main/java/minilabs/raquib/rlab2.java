package minilabs.raquib;

public class rlab2 {
    public static class Main {
        double teamWinningPercentage;
        String teamName;

        public Main(double percentage, String name) {
            teamWinningPercentage = percentage;
            teamName = name;
        }

        public void Main(String[] args) {
            Main theLakers = new Main(58.3, "Lakers");
            Main theClippers = new Main(65.3, "Clippers");
            System.out.println(theLakers.teamName + " Have a winning percentage of " + theLakers.teamName + "%, during the 2020-2021 NBA Season");
            System.out.println(theClippers.teamName + " Have a winning percentage of " + theClippers.teamName + "%, during the 2020-2021 NBA Season");
        }
    }

}
