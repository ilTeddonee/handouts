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

package it.unimi.di.prog2.e04;

import java.util.Scanner;

/**
 * Vedi <a
 * href=
 * "https://github.com/mapio/labprog/blob/master/esercizi/saltapicchio/Testo.md">testo</a>,
 * ma
 * senza il vincolo sul valore massimo per `N`.
 */
public class Saltapicchio {

  /** . */
  private Saltapicchio() {
  }

  /**
   * Verifica se la sequenza di interi in ingresso è saltapicchio e stampa
   * "saltapicchio" in caso affermativo.
   *
   * @param args la sequenza di interi in ingresso
   */
  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);
    int[] seq = new int[N];

    try (Scanner in = new Scanner(System.in)) {
      for (int i = 0; i < N; i++) {
        seq[i] = in.nextInt();
      }
    }
    if (saltapicchio(seq)) {
      System.out.println("saltapicchio");
    }
  }

  /**
   * Verifica se la sequenza di interi in ingresso è saltapicchio.
   *
   * @param seq la sequenza di interi in ingresso
   * @return {@code true} se la sequenza è saltapicchio, {@code false} altrimenti
   */
  static boolean saltapicchio(int[] seq) {
    int lenSeq = seq.length;
    int[] result = new int[lenSeq - 1];

    for (int i = 0; i < lenSeq - 1; i++) {

      result[i] = seq[i] - seq[i + 1];
      if (result[i] < 0) {
        result[i] = -result[i];
      }
    }
    for (int i = 1; i < lenSeq; i++) {
      if (!isIn(result, i)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Verifica se un intero è presente in una sequenza di interi.
   *
   * @param seq la sequenza di interi in ingresso
   * @param n   l'intero da cercare
   * @return {@code true} se l'intero è presente nella sequenza, {@code false}
   *         altrimenti
   */
  static boolean isIn(int[] seq, int n) {
    int len = seq.length;
    for (int i = 0; i < len; i++) {
      if (seq[i] == n) {
        return true;
      }
    }
    return false;
  }

}
