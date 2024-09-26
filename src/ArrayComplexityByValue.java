import java.util.Random;
public class ArrayComplexityByValue {

    //read by value
    public static void main(String[] args) {
        Random random = new Random();

        // Test for different sizes of arrays
        for (int size = 1000; size <= 1000000; size *= 10) {
            int[] array = new int[size];

            // Fill the array with random integers
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(size);
            }

            // Value to search for (worst case: not in the array)
            int searchValue = size + 1;

            // Measure time for search operation
            long startTime = System.nanoTime();

            // Searching for the value
            boolean found = false;
            for (int i = 0; i < size; i++) {
                if (array[i] == searchValue) {
                    found = true;
                    break;
                }
            }

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println("Time taken for search in array of size " + size + ": " + duration + " nanoseconds");
        }
    }
}