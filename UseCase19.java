public class UseCase19 {

    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("=======================================\n");

        // IMPORTANT: Array must be SORTED
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Bogie ID to search
        String searchId = "BG309";

        // Display all bogies
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // ----- BINARY SEARCH -----
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = searchId.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            }
            else if (result > 0) {
                low = mid + 1;     // search right half
            }
            else {
                high = mid - 1;    // search left half
            }
        }

        // Display result
        if (found) {
            System.out.println("\nBogie " + searchId + " found in train consist.");
        } else {
            System.out.println("\nBogie " + searchId + " NOT found.");
        }

        System.out.println("\nUC19 search completed...");
    }
}