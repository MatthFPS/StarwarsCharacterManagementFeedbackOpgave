import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Opretter listen af karakterer
        List<Character> characters = new ArrayList<>();


        // Tilføjer karakterer
        characters.add(new Jedi("Obi-Wan Kenobi", 30));
        characters.add(new Sith("Darth Sidious", 100));
        characters.add(new Droid("B1 Battle Droid", 300));
        characters.add(new BountyHunter("Boba Fett", 30));

        // Header
        System.out.println("==============================");
        System.out.println(" STAR WARS CHARACTER LIST");
        System.out.println("==============================");

        // Kalder action() og showInfo() for alle
        for (Character c : characters) {
            c.showInfo();
            c.action();
            c.goLive();
            System.out.println("==============================\n");
        }

        // Jedi mediterer
        System.out.println("==============================");
        System.out.println("=== Jedi Meditation Time ===");
        System.out.println("==============================");
        for (Character c : characters) {
            if (c instanceof Jedi) {
                ((Jedi) c).meditate();
                System.out.println("==============================\n");
            }
        }

        // Force Users bruger kraften (både Jedi og Sith)
        System.out.println("==============================");
        System.out.println("=== Force Users in Action ===");
        for (Character c : characters) {
            if (c instanceof ForceUser) {
                ((ForceUser) c).useForce();
            }
        }
        System.out.println("==============================");
        System.out.println();

        // Bounty Hunter jager
        System.out.println("==============================");
        System.out.println("=== Bounty Hunter Hunting ===");
        for (Character c : characters) {
            if (c instanceof BountyHunter) {
                ((BountyHunter) c).hunt();
                System.out.println("==============================");
            }
        }
    }
}
