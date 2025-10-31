import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Opretter listen af karakterene
        List<Character> characters = new ArrayList<>();

        // Tilføjer karakterer
        characters.add(new Jedi("Obi Wan Kenobi", 30));
        characters.add(new Sith("Darth Sidious", 100));
        characters.add(new Droid("B1 Battle droid", 300));
        characters.add(new BountyHunter("Boba Fett", 30));

        // Header
        System.out.println("==============================");
        System.out.println(" STARWARS CHARACTER LIST");
        System.out.println("==============================");

        // Først kalder vi action() og showInfo() for alle
        for (Character c : characters) {
            c.showInfo();
            c.action();
            c.goLive();
            System.out.println("==============================");
            System.out.println();
        }
        System.out.println("=============================");
        System.out.println("=== Jedi meditation time ===");

        // Loop hvor kun Jedi'er mediterer
        for (Character c : characters) {
            if (c instanceof Jedi) {
                // Typecast, så vi kan kalde meditate()
                ((Jedi) c).meditate();
                System.out.println("=============================");
                System.out.println();
            }
        }

        //Bounty Hunter Action
        System.out.println("=============================");
        System.out.println("=== Bounty Hunter Hunting ===");


        // Loop hvor kun BountyHunters jager
        for (Character c : characters) {
            if (c instanceof BountyHunter) {
                ((BountyHunter) c).hunt();
                System.out.println("=============================");
            }
        }
    }
}
