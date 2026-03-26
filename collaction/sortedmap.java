package collaction;

import java.util.TreeMap;
import java.util.Map;

public class sortedmap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();

        // Insertion
        tm.put(3, "Java");
        tm.put(1, "Aruansh");
        tm.put(2, "Copilot");

        // Traversing (sorted order)
        System.out.println("Traversing TreeMap:");
        for (Map.Entry<Integer, String> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Searching
        System.out.println("Searching key 2: " + tm.get(2));

        // Updation
        tm.put(2, "Updated Copilot");
        System.out.println("After updation: " + tm);

        // Deletion
        tm.remove(3);
        System.out.println("After deletion: " + tm);
    }
}