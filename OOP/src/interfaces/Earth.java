package interfaces;

public class Earth {

    public static void main(String[] args) {
        // Human tom;
        // Human joe;
        Human player1 = new Human("Holly Dae");
        Elf player2 = new Elf("Keajeon crimsonbeam");
        Dwarf player3 = new Dwarf("Flint Rockeater");

        System.out.println(player1.name);
        player1.displayStats();
        
        System.out.println();

        System.out.println(player2.name);
        player2.displayStats();

        System.out.println();

        System.out.println(player3.name);
        player3.displayStats();
        player3.attack();
        
        
       

    }

}
