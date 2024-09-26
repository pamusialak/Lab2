import java.util.ArrayList;
import java.util.Random;

public class ArrayListComplexity {
    public static void main(String[] args) {
        Random random = new Random();

        // Test for different sizes of ArrayLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            // Fill the ArrayList with random integers
            for (int i = 0; i < size; i++) {
                arrayList.add(random.nextInt(size * 2));  // Using size * 2 to reduce chance of duplicates
            }

            // Read by value
            int searchValue = random.nextInt(size * 2);
            long startTime = System.nanoTime();
            boolean contains = arrayList.contains(searchValue);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Time taken for search in ArrayList of size " + size + ": " + duration + " nanoseconds");

            // Insert at the beginning (head)
            int insertValue = size * 2;  // Ensuring a new value
            startTime = System.nanoTime();
            arrayList.add(0, insertValue);
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for insertion at the beginning of ArrayList of size " + size + ": " + duration + " nanoseconds");

            // Insert in the middle
            startTime = System.nanoTime();
            arrayList.add(size / 2, insertValue);
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for insertion in the middle of ArrayList of size " + size + ": " + duration + " nanoseconds");

            // Insert at the end (tail)
            startTime = System.nanoTime();
            arrayList.add(insertValue);
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for insertion at the end of ArrayList of size " + size + ": " + duration + " nanoseconds");

            // Remove from the beginning (head)
            startTime = System.nanoTime();
            arrayList.remove(0);
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for removal from the beginning of ArrayList of size " + size + ": " + duration + " nanoseconds");

            System.out.println();  // Empty line for readability
        }
    }
}
