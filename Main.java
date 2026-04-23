import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Train train = new Train();

        while (true) {
            System.out.println("\n1. Add Coach");
            System.out.println("2. Remove Coach");
            System.out.println("3. Display Train");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.next();

                    System.out.print("Enter Type: ");
                    String type = sc.next();

                    System.out.print("Enter Capacity: ");
                    int cap = sc.nextInt();

                    train.addCoach(new Coach(id, type, cap));
                    break;

                case 2:
                    System.out.print("Enter ID to remove: ");
                    train.removeCoach(sc.next());
                    break;

                case 3:
                    train.displayTrain();
                    break;

                case 4:
                    return;
            }
        }
    }
}