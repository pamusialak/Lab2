import java.util.LinkedList;
import java.util.Random;

public class LinkedListComplexity {
    public static void main(String[] args) {
        Random random = new Random();

        // Test for different sizes of LinkedLists
        for (int size = 1000; size <= 1000000; size *= 10) {
            LinkedList<Integer> linkedList = new LinkedList<>();

            // Fill the LinkedList with random integers
            for (int i = 0; i < size; i++) {
                linkedList.add(random.nextInt(size * 2));  // Using size * 2 to reduce chance of duplicates
            }

            // 1. Read by value
            int searchValue = random.nextInt(size * 2);
            long startTime = System.nanoTime();
            boolean contains = linkedList.contains(searchValue);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Time taken for search in LinkedList of size " + size + ": " + duration + " nanoseconds");

            // 2. Insert at the beginning (head)
            int insertValue = size * 2;  // Ensuring a new value
            startTime = System.nanoTime();
            linkedList.addFirst(insertValue);
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for insertion at the beginning of LinkedList of size " + size + ": " + duration + " nanoseconds");

            // 3. Insert in the middle
            startTime = System.nanoTime();
            linkedList.add(size / 2, insertValue);
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for insertion in the middle of LinkedList of size " + size + ": " + duration + " nanoseconds");

            // 4. Insert at the end (tail)
            startTime = System.nanoTime();
            linkedList.addLast(insertValue);
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for insertion at the end of LinkedList of size " + size + ": " + duration + " nanoseconds");

            // 5. Remove from the beginning (head)
            startTime = System.nanoTime();
            linkedList.removeFirst();
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time taken for removal from the beginning of LinkedList of size " + size + ": " + duration + " nanoseconds");

            System.out.println();  // Empty line for readability
        }
    }
}
