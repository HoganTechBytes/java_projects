package inheritance;

public class Earth {

    public static void main(String[] args) {
        // Human tom;
        // Human joe;
        Human player1 = new Human("Holly Dae");
        Elf player2 = new Elf("Keajeon crimsonbeam");

        System.out.println(player1.name);
        player1.displayStats();
        
        System.out.println();
        
        System.out.println(player1.name);
        player2.displayStats();
        
        
       

    }

}
