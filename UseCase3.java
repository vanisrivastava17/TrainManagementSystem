import java.util.*;

public class UseCase3 {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=======================================\n");

        // Create a Set (HashSet ensures uniqueness)
        Set<String> bogies = new HashSet<>();

        // Adding bogie IDs (including duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (will be ignored)
        bogies.add("BG101");
        bogies.add("BG102");

        // Display result
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}