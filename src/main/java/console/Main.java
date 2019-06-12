package console;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condition = 1;
        int ownRace = 0;
        int enemyRace = 0;

        RaceDrawer raceDrawer = new RaceDrawer(0, 0);
        System.out.println("Hi!");

        while (condition != 0) {
            if (condition == 1) {

                condition = raceDrawer.showRandomizedRaces(getDrawOptionFromUser(),raceDrawer.raceIndivualChecker(ownRace,enemyRace),raceDrawer.raceIndivualChecker(ownRace,enemyRace));
            } else if (condition == 2) {
                condition = optionSelection();
            }else if (condition == 3){
                condition = raceDrawer.showRandomizedRaces(getDrawOptionFromUser(),raceDrawer.raceIndivualChecker(ownRace,enemyRace),raceDrawer.raceIndivualChecker(ownRace,enemyRace));
            }else if (condition == 9){
                System.out.println("Gettin' back to options ;/");
                condition = 2;
            } else {
                System.out.println("Bye :)");
                condition = 0;
            }
        }
    }

    public static int getDrawOptionFromUser() {
        Scanner scanner = new Scanner(System.in);
        int userSelection = 0;

        System.out.println("Please choose which option you want to draw?");
        System.out.println("1) Your own");
        System.out.println("2) Your enemy");
        System.out.println("3) Both");

        boolean userSelectionChecker = scanner.hasNextInt();
        if (userSelectionChecker) {
            userSelection = scanner.nextInt();
        }
        if (!userSelectionChecker || userSelection < 1 || userSelection > 3) {
            System.out.println("You chose wrong argument! ;(");
            return 9;
        }
        System.out.println("You chose option: " + userSelection + " :)");
        return userSelection;
    }
    public static int optionSelection() {
        Scanner scanner = new Scanner(System.in);
        int optionInt = 9;

        System.out.println("What you want to do?");
        System.out.println("1)Go back to races selection?");
        System.out.println("2)Draw again?");
        System.out.println("3)Exit?");
        boolean option = scanner.hasNextInt();
        if (option) {
            optionInt = scanner.nextInt();
        }
        if (!option || optionInt < 1 || optionInt > 3) {
            return 9;
        } else if (optionInt == 2){
            return optionInt + 1;
        } else{
            return optionInt;
        }
    }
}

