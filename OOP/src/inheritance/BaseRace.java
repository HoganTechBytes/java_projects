package inheritance;

public class BaseRace {

    int stamina = 85;
    int strength = 85;
    int intelligence = 85;
    int agility = 85;
    int spirit = 85;

    String name;

    public BaseRace(){

    }

    public void displayStats(){
        System.out.printf("Health: %d%n",(int)((stamina * 10) / 100));
        System.out.printf("Mana: %d%n",(int)((intelligence * 10) / 100));
    }

}
