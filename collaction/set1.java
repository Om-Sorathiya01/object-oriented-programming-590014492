package collaction;
import java.util.*;

public class set1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a Set
        Set<Integer> set = new HashSet<>();

        int choice;

        do {
            System.out.println("\n--- SET OPERATIONS ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Traverse");
            System.out.println("5. Update");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: // Insert
                    System.out.print("Enter value to insert: ");
                    int insertVal = sc.nextInt();
                    if (set.add(insertVal)) {
                        System.out.println("Inserted successfully.");
                    } else {
                        System.out.println("Value already exists (Set doesn't allow duplicates).");
                    }
                    break;

                case 2: // Delete
                    System.out.print("Enter value to delete: ");
                    int delVal = sc.nextInt();
                    if (set.remove(delVal)) {
                        System.out.println("Deleted successfully.");
                    } else {
                        System.out.println("Value not found.");
                    }
                    break;

                case 3: // Search
                    System.out.print("Enter value to search: ");
                    int searchVal = sc.nextInt();
                    if (set.contains(searchVal)) {
                        System.out.println("Value found in set.");
                    } else {
                        System.out.println("Value not found.");
                    }
                    break;

                case 4: // Traverse
                    System.out.println("Set elements:");
                    for (int num : set) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

                case 5: // Update
                    System.out.print("Enter value to update (old value): ");
                    int oldVal = sc.nextInt();

                    if (set.contains(oldVal)) {
                        set.remove(oldVal);

                        System.out.print("Enter new value: ");
                        int newVal = sc.nextInt();

                        set.add(newVal);
                        System.out.println("Updated successfully.");
                    } else {
                        System.out.println("Value not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}