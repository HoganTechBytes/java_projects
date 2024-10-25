package interfaces;

public class Dwarf extends BaseRace implements Attacks{

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

    public void attack(){

        System.out.printf("You punch for %d points of damage!%n", (int)(3 + (strength *.02)));

    }

}
