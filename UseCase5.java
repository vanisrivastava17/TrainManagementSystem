import java.util.*;

public class UseCase5 {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("=======================================\n");

        // LinkedHashSet preserves order + removes duplicates
        Set<String> formation = new LinkedHashSet<>();

        // Add bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Try adding duplicate
        formation.add("Sleeper"); // duplicate (ignored)

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}