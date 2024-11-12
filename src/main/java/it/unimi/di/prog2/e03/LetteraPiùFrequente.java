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

package it.unimi.di.prog2.e03;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * Vedi <a
 * href=
 * "https://github.com/mapio/labprog/blob/master/esercizi/lettera_piu_frequente/Testo.md">testo</a>,
 */
public class LetteraPiùFrequente {
  /** . */
  private LetteraPiùFrequente() {
  }

  /**
   * Legge una sequenza di parole dallo standard input e restituisce il numero di
   * occorrenze della lettera più frequente.
   *
   * @param args ignoti
   */
  public static void main(String[] args) {
    List<String> parole = new ArrayList<>();

    try (Scanner s = new Scanner(System.in)) {
      while (s.hasNext()) {
        final String parola = s.nextLine();
        parole.add(parola);
      }
    }
    System.out.println(PiùFrequente(parole));
  }

  /**
   * Restituisce il numero di occorrenze della lettera più frequente nelle parole
   * fornite.
   *
   * @param parole una lista di parole
   * @return il numero di occorrenze della lettera più frequente
   */
  public static int PiùFrequente(List<String> parole) {
    int[] frequenze = new int[26];

    for (String parola : parole) {
      for (int i = 0; i < parola.length(); i++) {
        char c = parola.charAt(i);
        if (Character.isLetter(c)) {
          c = Character.toLowerCase(c);
          frequenze[c - 'a']++;
        }
      }
    }
    int max = frequenze[0];
    for (int i = 0; i < frequenze.length; i++) {
      if (frequenze[i] > max) {
        max = frequenze[i];
      }
    }
    return max;
  }
}
