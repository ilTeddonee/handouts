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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Vedi <a
 * href=
 * "https://github.com/mapio/labprog/blob/master/esercizi/bounding_box/Testo.md">testo</a>,
 */
public class BoundingBox {

  /** . */
  private BoundingBox() {
  }

  // Completa il seguente main
  /**
   * Legge da standard input una sequenza di righe contenenti solo '.' e '*' e
   * stampa su standard output le dimensioni del bounding box che racchiude tutti
   * i caratteri '*'.
   * 
   * @param args ignora gli argomenti del programma
   */
  public static void main(String[] args) {
    List<String> linee = new ArrayList<String>();
    try (Scanner s = new Scanner(System.in)) {
      while (s.hasNext()) {
        final String linea = s.nextLine();
        linee.add(linea);
      }
    }
    int firstRow = -1;
    int lastRow = -1;
    int firstCol = -1;
    int lastCol = -1;

    for (int i = 0; i < linee.size(); i++) { // scannerizzo ogni riga per trovare il primo e ultimo indice di '*'
      String riga = linee.get(i);
      if (riga.contains("*")) {
        if (firstRow == -1) {
          firstRow = i;
          lastRow = i;
        } else {
          lastRow = i;
        }
      }
      for (int j = 0; j < riga.length(); j++) { // per ogni riga scannerizzo le colonne per trovare il primo e l'ultimo
                                                // indice di '*'
        if (riga.charAt(j) == '*') {
          if (firstCol == -1) {
            firstCol = j;
          } else if (i == 0) {
            lastCol = j;
          } else {
            if (j < firstCol) {
              firstCol = j;
            }
            if (j > lastCol) {
              lastCol = j;
            }
          }
        }
      }
    }
    // calcolo la dimensione del bounding box
    int col = lastCol - firstCol + 1;
    int row = lastRow - firstRow + 1;
    System.out.printf("%d %d\n", row, col);
  }
}
