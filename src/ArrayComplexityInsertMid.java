import java.util.Random;
public class ArrayComplexityInsertMid {
    public static void main(String[] args) {
        Random random = new Random();

        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with random integers
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(size);
            }

            // Value to insert in the middle
            int insertValue = random.nextInt(size);

            // Calculate the middle index
            int midIndex = size / 2;

            // Measure time for insertion operation
            long startTime = System.nanoTime();

            // Create a new array with size + 1
            int[] newArray = new int[size + 1];

            // Copy the first half of the array
            System.arraycopy(array, 0, newArray, 0, midIndex);

            // Insert the new value in the middle
            newArray[midIndex] = insertValue;

            // Copy the second half of the array
            System.arraycopy(array, midIndex, newArray, midIndex + 1, size - midIndex);

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for insertion in the middle of array of size " + size + ": " + duration + " nanoseconds");
        }
    }
}

