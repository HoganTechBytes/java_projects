package inheritance;

public class Dwarf extends BaseRace{

    public Dwarf(String name){
        // Get default stats
        super();

        // Set player name
        this.name = name;

        // Modify Elf base stats
        this.strength += 10;
        this.stamina += 10;
        this.agility -= 10;
        this.spirit -= 10;
        
    }

}
