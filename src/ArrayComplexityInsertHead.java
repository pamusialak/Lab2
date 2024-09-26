import java.util.Random;
public class ArrayComplexityInsertHead {

    public static void main(String[] args) {
        Random random = new Random();

        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with random integers
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(size);
            }

            // Value to insert at the beginning
            int insertValue = random.nextInt(size);

            // Measure time for insertion operation
            long startTime = System.nanoTime();

            // Create a new array with size + 1
            int[] newArray = new int[size + 1];

            // Insert the new value at the beginning
            newArray[0] = insertValue;

            // Copy the rest of the elements
            System.arraycopy(array, 0, newArray, 1, size);

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for insertion at the beginning of array of size " + size + ": " + duration + " nanoseconds");
        }
    }
}
