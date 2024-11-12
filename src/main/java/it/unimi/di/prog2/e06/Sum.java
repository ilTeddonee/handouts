package it.unimi.di.prog2.e06;

import java.util.List;

/**
 * La classe Sum implementa un metodo che calcola la somma degli interi
 * contenuti in una lista.
 */
public class Sum {

    /** . */
    private Sum() {
    }

    /**
     * Sum prende in input un array di interi e ne restituisce la somma.
     * Se l'array è vuoto, la funzione lancia {@code NullPointerException}.
     * 
     * @param a array di interi.
     * @return la somma degli interi dell'array.
     * @throws NullPointerException se l'array è vuoto.
     */
    public static int sum(List<Integer> a) {
        if (a.isEmpty()) {
            throw new NullPointerException("Array vuoto");
        }
        int somma = 0;
        for (int n : a) {
            somma += n;
        }
        return somma;
    }
}
