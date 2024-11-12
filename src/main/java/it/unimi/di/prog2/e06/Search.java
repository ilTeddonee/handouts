package it.unimi.di.prog2.e06;

/**
 * Class {@code Search} provides a method to search for an integer in a sequence
 */
public class Search {

    /** . */
    private Search() {
    }

    /**
     * Searches for an integer in a sorted sequence of integers.
     * Requires that the sequence is sorted.
     * If {@code sequence} is {@code null} throws {@code NullPointerException}.
     * 
     * @param sequence The sorted sequence of integers.
     * @param toFind   The integer to search for.
     * @return The position of the integer in the sequence, or -1 if the integer is
     *         not present.
     * @throws NullPointerException If {@code sequence} is {@code null}.
     */
    public static int search(int[] sequence, int toFind) {
        if (sequence == null) {
            throw new NullPointerException("sequence is null");
        }
        int left = 0;
        int right = sequence.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (sequence[middle] == toFind) {
                return middle;
            } else if (sequence[middle] < toFind) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
