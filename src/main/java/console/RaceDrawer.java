package console;

import java.util.Random;
import java.util.Scanner;

public class RaceDrawer {
    private int ownRaceInt, enemyRaceInt;

    public RaceDrawer(int ownRaceInt, int enemyRaceInt) {
        this.ownRaceInt = ownRaceInt;
        this.enemyRaceInt = enemyRaceInt;
    }

    public int getOwnRaceInt() {
        return ownRaceInt;
    }

    public void setOwnRaceInt(int ownRaceInt) {
        this.ownRaceInt = ownRaceInt;
    }

    public int getEnemyRaceInt() {
        return enemyRaceInt;
    }

    public void setEnemyRaceInt(int enemyRaceInt) {
        this.enemyRaceInt = enemyRaceInt;
    }

    public int drawRace(){
        Random random = new Random();
        return random.nextInt(14);
    }

    public String getRaceName(int draw) {
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

    public int showRandomizedRaces(int userSelection, int ownRaceInt, int enemyRaceInt){
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
    public int raceIndivualChecker(int ownRaceOld, int enemyRaceOld){
        int race;
        do{
            race = drawRace();
        }while(race == ownRaceOld && race == enemyRaceOld);
        return race;
    }

    }

