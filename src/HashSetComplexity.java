import java.util.HashSet;
import java.util.Random;
public class HashSetComplexity {

    public static void main(String[] args) {
        Random random = new Random();

        // Test for different sizes of HashSets
        for (int size = 1000; size <= 1000000; size *= 10) {
            HashSet<Integer> hashSet = new HashSet<>();

            // Fill the HashSet with random integers
            for (int i = 0; i < size; i++) {
                hashSet.add(random.nextInt(size * 2));  // Using size * 2 to reduce chance of duplicates
            }

            // Read by value
            int searchValue = random.nextInt(size * 2);
            long startTime = System.nanoTime();
            boolean contains = hashSet.contains(searchValue);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Time taken for search in HashSet of size " + size + ": " + duration + " nanoseconds");

            // Insert (same for "head", "mid", "tail" as HashSet is unordered)
            int insertValue = size * 2;  // Ensuring a new value
            startTime = System.nanoTime();
            hashSet.add(insertValue);
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for insertion in HashSet of size " + size + ": " + duration + " nanoseconds");

            // Remove (same for "head" as HashSet is unordered)
            int removeValue = hashSet.iterator().next();  // Get any value from the set
            startTime = System.nanoTime();
            hashSet.remove(removeValue);
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for removal from HashSet of size " + size + ": " + duration + " nanoseconds");

            System.out.println();  // Empty line for readability
        }
    }
}