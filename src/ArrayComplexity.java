public class ArrayComplexity {

    //read by index

    public class ArrayTimeComplexity {
        public static void main(String[] args) {
            // Test for different sizes of arrays
            for (int size = 1000; size <= 1000000; size *= 10) {
                int[] array = new int[size];

                // Fill the array with integers
                for (int i = 0; i < size; i++) {
                    array[i] = i;
                }

                // Measure time for search operation
                long startTime = System.nanoTime();

                // Searching for the last element
                boolean found = false;
                for (int i = 0; i < size; i++) {
                    if (array[i] == size - 1) {
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
}
