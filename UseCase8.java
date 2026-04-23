import java.util.*;
import java.util.stream.Collectors;

public class UseCase8 {

    // Reusing Bogie class from UC7
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("=======================================\n");

        // Create list (same as UC7)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display all bogies
        System.out.println("All Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // 🔥 Stream Filtering (IMPORTANT LINE)
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie b : filtered) {
            System.out.println(b);
        }

        System.out.println("\nUC8 filtering completed...");
    }
}