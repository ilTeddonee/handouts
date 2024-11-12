/*

Copyright 2024 Massimo Santini

This file is part of "Programmazione 2 @ UniMI" teaching material.

This is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This material is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this file.  If not, see <https://www.gnu.org/licenses/>.

*/

package it.unimi.di.prog2.e06;

import java.util.Scanner;

/** Esercizio 4.2 di PDJ. */
public class SearchClient {

  /** . */
  private SearchClient() {
  }

  // Il main di questa classe legge dal flusso di ingresso una sequenza di
  // interi (separati da spazi) e, assumendo che sia ordinata in ordine
  // crescente, emette nel flusso d'uscita la posizione dell'intero specificato
  // sulla linea di comando (se presente nell'input), o -1 viceversa.

  /**
   * Prints the position of the requested integer in the sequence. If the integer
   * is not present in the sequence, -1 is printed.
   * 
   * @param args The argument is the integer to search for.
   */
  public static void main(String[] args) {
    // Leggo l'intero da cercare
    int toFind = Integer.parseInt(args[0]);

    // Leggo la sequenza di interi
    String line = null;
    try (Scanner scanner = new Scanner(System.in)) {
      line = scanner.nextLine();
    }
    String[] tokens = line.split(" ");
    int[] sequence = new int[tokens.length];
    for (int i = 0; i < tokens.length; i++) {
      sequence[i] = Integer.parseInt(tokens[i]);
    }
    // Cerco l'intero
    int position = Search.search(sequence, toFind);
    // Stampo il risultato
    System.out.println(position);
  }
}
