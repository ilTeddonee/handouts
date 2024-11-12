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

/** Esercizio 3.2 di PDJ. */
public class SumClient {

  /** . */
  private SumClient() {
  }

  // Aggiunga qui un main che invochi il metodo sum (che può sviluppare in
  // questa o altra classe) descritto dall'esercizio 3.2 di PDJ.

  // Il main riceve un elenco di interi come parametri sulla linea di comando e
  // ne emette la somma nel flusso d'ingresso.

  /**
   * Il main prende in input un elenco di interi da riga di comando e ne stampa la
   * somma.
   * 
   * @param args l'elenco di interi in input.
   */
  public static void main(String[] args) {
    int[] a = new int[args.length];

    for (int i = 0; i < args.length; i++) {
      a[i] = Integer.valueOf(args[i]);
    }
    int somma = sum(a);
    System.out.println(somma);
  }

  /**
   * Sum prende in input un array di interi e ne restituisce la somma.
   * 
   * @param a array di interi.
   * @return la somma degli interi dell'array.
   */
  public static int sum(int[] a) {
    int somma = 0;
    for (int n : a) {
      somma += n;
    }
    return somma;
  }
}