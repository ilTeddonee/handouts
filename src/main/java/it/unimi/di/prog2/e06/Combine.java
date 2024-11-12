package it.unimi.di.prog2.e06;

/**
 * La classe {@code Combine} fornisce un metodo per combinare due array di
 * interi, come illustrato dall'esercizio 4.4 di PDJ.
 */
public class Combine {
    /** . */
    private Combine() {
    }

    /**
     * Multiplies every element of {@code a} for the sum of all elements of
     * {@code b}. If {@code a} or {@code b} is {@code null}, the method throws a
     * {@link NullPointerException}.
     * 
     * @param a first array of integers
     * @param b second array of integers
     * @return an array of integers obtained by multiplying every element of
     *         {@code a} for the sum of all elements of {@code b}
     * @throws NullPointerException if {@code a} or {@code b} is {@code null}
     */
    public static int[] combine(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new NullPointerException("a and b cannot be null");
        }
        int[] result = new int[a.length];
        int sum = 0;
        for (int i : b) {
            sum += i;
        }
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] * sum;
        }
        return result;
    }
}
