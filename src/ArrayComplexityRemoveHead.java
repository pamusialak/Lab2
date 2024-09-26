import java.util.Random;
public class ArrayComplexityRemoveHead {
    public static void main(String[] args) {
        Random random = new Random();

        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with random integers
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(size);
            }

            // Measure time for removal operation
            long startTime = System.nanoTime();

            // Create a new array with size - 1
            int[] newArray = new int[size - 1];

            // Copy all elements except the first one
            System.arraycopy(array, 1, newArray, 0, size - 1);

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for removal from the beginning of array of size " + size + ": " + duration + " nanoseconds");
        }
    }
}
