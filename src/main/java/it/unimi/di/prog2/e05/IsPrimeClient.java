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

/** Esercizio 3.3 di PDJ. */
public class IsPrimeClient {

  /** . */
  private IsPrimeClient() {
  }

  // Aggiunga qui un main che invochi il metodo isPrime (che può sviluppare in
  // questa o altra classe) descritto dall'esercizio 3.3 di PDJ.
  /**
   * Il metodo main legge un intero da linea di comando e stampa "true" se e solo
   * se esso è primo.
   * 
   * @param args l'input da linea di comando
   */
  public static void main(String[] args) {
    int n = Integer.valueOf(args[0]);

    if (isPrime(n)) {
      System.out.println("true");
    }
  }

  // Il main riceve un intero come parametro sulla linea di comando ed emette
  // "true" nel flusso d'uscita se e solo se esso è primo.
  /**
   * Il metodo isPrime prende in input un intero >= 0 e restituisce "true" se è
   * primo e "false" altrimenti
   * 
   * @param n intero positivo
   * @return "true" se n è primo, "false" altrimenti
   */
  public static boolean isPrime(int n) {
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}