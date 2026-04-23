public class UseCase20 {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("==========================================\n");

        // Try changing this to empty {} to test exception
        String[] bogieIds = {"BG101", "BG205", "BG309"};

        String searchId = "BG309";

        try {

            // 🔴 VALIDATION (IMPORTANT)
            if (bogieIds == null || bogieIds.length == 0) {
                throw new IllegalStateException("No bogies available for search!");
            }

            // Display bogies
            System.out.println("Available Bogie IDs:");
            for (String id : bogieIds) {
                System.out.println(id);
            }

            // Simple search (can be linear or binary)
            boolean found = false;

            for (String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("\nBogie " + searchId + " found.");
            } else {
                System.out.println("\nBogie " + searchId + " NOT found.");
            }

        } catch (IllegalStateException e) {

            System.out.println("Error: " + e.getMessage());

        }

        System.out.println("\nUC20 execution completed...");
    }
}