import java.util.*;

class Train {

    LinkedList<Coach> coaches = new LinkedList<>();

    void addCoach(Coach c) {
        coaches.add(c);
    }

    void removeCoach(String id) {
        for (Coach c : coaches) {
            if (c.coachId.equals(id)) {
                coaches.remove(c);
                System.out.println("Coach removed");
                return;
            }
        }
        System.out.println("Coach not found");
    }

    void displayTrain() {
        if (coaches.isEmpty()) {
            System.out.println("No coaches");
            return;
        }

        for (Coach c : coaches) {
            System.out.print(c + " -> ");
        }
        System.out.println("END");
    }
}