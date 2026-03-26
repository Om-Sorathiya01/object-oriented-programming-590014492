package collaction;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();

        // Insertion
        hm.put(1, "Aruansh");
        hm.put(7, "Copilot");
        hm.put(3, "Java");

        // Traversing
        System.out.println("Traversing HashMap:");
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Searching
        System.out.println("Searching key 2: " + hm.get(2));

        // Updation
        hm.put(2, "Updated Copilot");
        System.out.println("After updation: " + hm);

        // Deletion
        hm.remove(3);
        System.out.println("After deletion: " + hm);
    }
}