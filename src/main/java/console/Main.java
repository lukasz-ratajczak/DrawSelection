package console;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer condition = 1;
        int ownRace = 0;
        int enemyRace = 0;

        System.out.println("Hi!");

        while (condition != 0) {
            if (condition == 1) {

                condition = showRandomizedRaces(getDrawOptionFromUser(),raceIndivualChecker(ownRace,enemyRace),raceIndivualChecker(ownRace,enemyRace));
            } else if (condition == 2) {
                condition = optionSelection();
            }else if (condition == 9){
                System.out.println("Gettin' back to options ;/");
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

    public static int drawRace(){
        Random random = new Random();
        return random.nextInt(14);
    }

    public static String getRaceName(int draw) {
        String raceName;
        switch (draw) {
            case 0:
                raceName = "Wood Elves";
                break;
            case 1:
                raceName = "Bretony";
                break;
            case 2:
                raceName = "Greenskins";
                break;
            case 3:
                raceName = "Empire";
                break;
            case 4:
                raceName = "High Elves";
                break;
            case 5:
                raceName = "Dark Elves";
                break;
            case 6:
                raceName = "Tomb Kings";
                break;
            case 7:
                raceName = "Vampires";
                break;
            case 8:
                raceName = "Lizardman";
                break;
            case 9:
                raceName = "Dvarves";
                break;
            case 10:
                raceName = "Skaven";
                break;
            case 11:
                raceName = "Norsca";
                break;
            case 12:
                raceName = "Chaos";
                break;
            case 13:
                raceName = "Beatsman";
                break;
            case 14:
                raceName = "Vampirates";
                break;
            default:
                raceName = "!!! ERROR !!!";
        }
        return raceName;
    }

    public static int showRandomizedRaces(int userSelection, int ownRaceInt, int enemyRaceInt){
        String ownRace = getRaceName(ownRaceInt);
        String enemyRace = getRaceName(enemyRaceInt);
        if(userSelection ==1){
            System.out.println("Your race is: "+ownRace+"! :)");
            return 2;
        }else if( userSelection == 2){
            System.out.println("Enemy race is: "+enemyRace+"! :)");
            return 2;
        }else if (userSelection ==3){
            System.out.println("Your race is: "+ownRace+"! -  and Enemy race is: "+ enemyRace+"! :)");
            return 2;
        }else{
            System.out.println("Error!");
            return 9;
        }
    }
    public static int raceIndivualChecker(int ownRaceOld, int enemyRaceOld){
        int race;
        do{
            race = drawRace();
        }while(race != ownRaceOld && race != enemyRaceOld);
    return race;
    }
    public static int optionSelection(){
        Scanner scanner = new Scanner(System.in);
        int optionInt = 9;

        System.out.println("What you want to do?");
        System.out.println("1)Go back to races selection?");
        System.out.println("2)Draw again?");
        System.out.println("3)Exit?");
        boolean option = scanner.hasNextInt();
        if(option){
            optionInt = scanner.nextInt();
        }if(!option || optionInt < 1 || optionInt > 3){
            return 9;
        }else{
            return optionInt;
        }
    }
}

