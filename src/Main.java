//method overloading = using same method name with different parameters

public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(13, 8);
        calcFeetAndInchesToCentimeters(0, 12);
        calcFeetAndInchesToCentimeters(69);

    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {

        if (feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid value");
            return -1;
        }
        double centimeters = (feet / 0.032808) + (inches / 0.39370);
        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " cm");
        return centimeters;

    }

    public static double calcFeetAndInchesToCentimeters (double inches) {

        if (inches < 0) {
            System.out.println("Invalid value");
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore (int score) {
        System.out.println("Unamed player scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore () {
        System.out.println("No player name, no player score.");
        return 0;
    }
}