import java.util.Random;

public class Scanario3 {

    public static void main(String[] args) {
        int totDays = 1000000;

        int sunnyCount = 0;
        int cloudyCount = 0;
        int rainyCount = 0;
        int stormyCount = 0;

        Random rn = new Random();

        for (int i = 0; i < totDays; i++) {
            int chance = rn.nextInt(100);

            String Weather;
            if (chance < 40) { //0 da olduğu için 40 dahil değil
                Weather = "Sunny";
                sunnyCount++;
            } else if (chance < 70) {
                Weather = "Cloudy";
                cloudyCount++;
            } else if (chance < 90) {
                Weather = "Rainy";
                rainyCount++;
            } else {
                Weather = "Stormy";
                stormyCount++;
            }

            if (i % 100000 == 0) {
                System.out.println("Day " + i + ": " + Weather);
            }
        }

        System.out.println("Simulation finished. Total days: " + totDays);

        System.out.println("Sunny: " + sunnyCount + " days (" + (double)sunnyCount / totDays * 100 + "%)");
        System.out.println("Cloudy: " + cloudyCount + " days (" + (double)cloudyCount / totDays * 100 + "%)");
        System.out.println("Rainy: " + rainyCount + " days (" + (double)rainyCount / totDays * 100 + "%)");
        System.out.println("Stormy: " + stormyCount + " days (" + (double) stormyCount / totDays * 100 + "%)");
    }
}

