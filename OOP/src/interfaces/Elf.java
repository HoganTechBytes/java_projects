package interfaces;

public class Elf extends BaseRace{

    public Elf(String name){
        // Get default stats
        super();

        // Set player name
        this.name = name;

        // Modify Elf base stats
        this.intelligence += 15;
        this.stamina -= 5;
        this.strength -= 10;
    }
    

}
