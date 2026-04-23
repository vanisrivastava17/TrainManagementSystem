import java.util.*;

public class UseCase2 {

    public static void main(String[] args) {

        // 🔹 Header (same style as UC1)
        System.out.println("=================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("=================================\n");

        // 🔹 Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // 🔹 ADD Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // 🔹 REMOVE
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // 🔹 CHECK
        System.out.println("\nChecking if 'Sleeper' exists:");
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + exists);

        // 🔹 FINAL OUTPUT
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}