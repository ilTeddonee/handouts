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

import java.util.ArrayList;
import java.util.List;

/**
 * Vedi <a
 * href=
 * "https://github.com/mapio/labprog/blob/master/esercizi/somma_strana/Testo.md">testo</a>,
 * ma
 * leggendo gli addendi dal flusso di ingresso.
 */
public class SommaStrana {

  /** . */
  private SommaStrana() {
  }

  // Per memorizzare un elenco di interi si può usare list<Integer>, grazie
  // all'boxing automatico https://dev.java/learn/numbers-strings/autoboxing/
  // se la lista è stata dichiarata come
  //
  // List<Integer> interi = new ArrayList<>();
  //
  // sono legittime espressioni del tipo
  //
  // interi.add(3);
  // int y = interi.get(0);
  //
  // dove vengono messi e prelevati dalla lista degli int, non degli Integer.
  /**
   * Fa la somma strana di due numeri.
   * 
   * @param args due numeri da sommare
   */
  public static void main(String[] args) {
    String primoAddendo = args[0];
    String secondoAddendo = args[1];

    List<Integer> addendo1 = new ArrayList<>();
    List<Integer> addendo2 = new ArrayList<>();

    int len1 = primoAddendo.length();
    int len2 = secondoAddendo.length();

    for (int i = 0; i < len1; i++) {
      addendo1.add(Character.getNumericValue(primoAddendo.charAt(i)));
    }
    for (int i = 0; i < len2; i++) {
      addendo2.add(Character.getNumericValue(secondoAddendo.charAt(i)));
    }
    if (len1 > len2) {
      for (int i = 0; i < len1 - len2; i++) {
        addendo2.add(0, 0);
      }
    } else if (len2 > len1) {
      for (int i = 0; i < len2 - len1; i++) {
        addendo1.add(0, 0);
      }
    }

    List<Integer> sommaStrana = sommaStrana(addendo1, addendo2);

    int len = sommaStrana.size();
    for (int i = 0; i < len; i++) {
      System.out.print(sommaStrana.get(i));
    }
    System.out.println();
  }

  /**
   * Fa la somma strana di due numeri.
   * 
   * @param addendo1 primo addendo.
   * @param addendo2 secondo addendo.
   * @return la somma strana.
   */
  static List<Integer> sommaStrana(List<Integer> addendo1, List<Integer> addendo2) {
    List<Integer> somma = new ArrayList<>();
    int len1 = addendo1.size();
    int len2 = addendo2.size();

    int i = len1 - 1;
    int j = len2 - 1;
    int reminder = 0;
    while (i >= 0 && j >= 0) {
      int s = addendo1.get(i) + addendo2.get(j) + reminder;
      int cifra = s % 10;
      reminder = s / 10;
      if (s > 9) {
        somma.add(0, 9 - cifra);
      } else {
        somma.add(0, s);
      }
      if (i == 0 && reminder > 0) {
        somma.add(0, reminder);
      }
      i--;
      j--;
    }
    return somma;
  }
}
