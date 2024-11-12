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

/**
 * Vedi <a
 * href=
 * "https://github.com/mapio/labprog/blob/master/esercizi/nave_spaziale/Testo.md">testo</a>.
 */
public class NaveSpaziale {

  /** . */
  private NaveSpaziale() {
  }

  // Se String[] args è il vettore che contiene gli argomenti sulla linea
  // di comando, potete convertire i primi due in numeri interi con le
  // dichiarazioni (e inizializzazioni) seguenti
  //
  // int from = Integer.parseInt(args[0]);
  // int to = Integer.parseInt(args[1]);
  //
  // non c'è bisogno di importare alcun package per poter usare Integer.
  /**
   * Legge due interi da riga di comando e stampa il viaggio più breve.
   * 
   * @param args due interi, corrispontenti a from e to
   */
  public static void main(String[] args) {
    int from = Integer.parseInt(args[0]);
    int to = Integer.parseInt(args[1]);

    System.out.println(ViaggioPiuBreve(from, to));
  }

  /**
   * Restituisce il viaggio più breve da from a to.
   * 
   * @param from coordinata di partenza
   * @param to   coordinata di arrivo
   * @return il viaggio più breve da from a to
   */
  public static String ViaggioPiuBreve(int from, int to) {
    String result = "";
    if (to < 4 * from) {
      for (int i = from; i < to; i++) {
        result += "P";
      }
    } else if (to % 2 == 0) {
      int i = from;
      while (i < to / 4) {
        result += "P";
        i++;
      }
      while (i <= to - (to / 4)) {
        result += "S";
        i *= 4;
      }
      while (i < to) {
        result += "P";
        i++;
      }
    } else {
      int i = from;
      while (i <= to - (to / 4)) {
        result += "S";
        i *= 4;
      }
      while (i < to) {
        result += "P";
        i++;
      }
    }
    return result;
  }
}
