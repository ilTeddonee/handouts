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

package it.unimi.di.prog2.e05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** Esercizio 3.1 di PDJ. */
public class GcdClient {

  /** . */
  private GcdClient() {
  }

  // Aggiunga qui un main che invochi il metodo gcd (che può sviluppare in
  // questa o altra classe) descritto dall'esercizio 3.1 di PDJ

  /**
   * Il metodo main legge due interi e stampa a schermo il loro gcd.
   * 
   * @param args default input
   */
  public static void main(String[] args) {
    List<Coppia> coppie = new ArrayList<>();
    try (Scanner s = new Scanner(System.in)) {
      while (s.hasNextInt()) {
        int n = s.nextInt();
        if (s.hasNextInt()) {
          int d = s.nextInt();

          Coppia coppia = new Coppia(n, d);
          coppie.add(coppia);
        }
      }
    }
    for (Coppia coppia : coppie) {
      int gcd = GcdClient.Gcd(coppia);
      System.out.println(gcd);
    }
  }

  /**
   * Calcola il gcd tra due numeri interi >= 0.
   * 
   * @param coppia la coppia di numeri di cui calcolare il gcd
   * @return il gcd tra n e d
   */
  public static int Gcd(Coppia coppia) {
    int n = coppia.n;
    int d = coppia.d;
    int min = n; // min è il più piccolo tra i due interi, infatti non può avere un divisore più
                 // grande di sè stesso
    if (d < n) {
      min = d;
    }

    for (int i = min; i > 0; i--) {
      if (n % i == 0 && d % i == 0) {
        return i;
      }
    }
    return 1;
  }

  // Il main legge dal flusso di ingresso coppie di numeri ed emette nel flusso
  // d'uscita il loro gcd.

}

/**
 * Coppia è una classe in cui ogni elemento è formato da due interi
 */
class Coppia {
  /** Primo elemento della coppia */
  int n;
  /** Secondo elemento della coppia */
  int d;

  /**
   * Costruttore per la classe Coppie
   * 
   * @param primo   primo elemento
   * @param secondo secondo elemento
   */
  public Coppia(int primo, int secondo) {
    this.n = primo;
    this.d = secondo;
  }
}