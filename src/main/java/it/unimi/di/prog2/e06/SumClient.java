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

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** Esercizio 4.3 di PDJ. */
public class SumClient {

  /** . */
  private SumClient() {
  }

  // Il main di questa classe legge dal flusso di ingresso una sequenza di al
  // più 100 interi e ne emette la somma nel flusso d'uscita.

  /**
   * Il main prende in input un elenco di interi da riga di comando e ne stampa la
   * somma.
   * 
   * @param args l'elenco di interi in input.
   */
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    try (Scanner scanner = new Scanner(System.in)) {
      for (int i = 0; i < 100; i++) {
        if (!scanner.hasNextInt()) {
          break;
        }
        list.add(scanner.nextInt());
      }
    }
    int somma = Sum.sum(list);
    System.out.println(somma);
  }
}