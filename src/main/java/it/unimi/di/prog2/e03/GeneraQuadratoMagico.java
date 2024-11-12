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

/**
 * Vedi <a
 * href=
 * "https://github.com/mapio/labprog/blob/master/esercizi/genera_quadrato_magico/Testo.md">testo</a>,
 */
public class GeneraQuadratoMagico {
  /** . */
  private GeneraQuadratoMagico() {
  }

  /**
   * Genera un quadrato magico di ordine N.
   * 
   * @param args un array di stringhe, il primo elemento deve essere un intero N
   */
  public static void main(String[] args) {
    final int N = Integer.parseInt(args[0]);

    int[][] mat = generaMatrice(N);
    mat = riempiMatrice(mat);

    for (int[] riga : mat) {
      for (int elem : riga) {
        System.out.printf("%d ", elem);
      }
      System.out.println();
    }

  }

  /**
   * Genera una matrice quadrata di ordine N.
   * 
   * @param N l'ordine della matrice
   * @return una matrice quadrata di ordine N
   */
  public static int[][] generaMatrice(int N) {
    int[][] mat = new int[N][N];
    return mat;
  }

  /**
   * Riempie una matrice quadrata di ordine N con i numeri da 1 a N^2 in modo da
   * ottenere un quadrato magico.
   * 
   * @param mat una matrice quadrata di ordine N
   * @return la matrice riempita
   */
  public static int[][] riempiMatrice(int[][] mat) {
    int N = mat.length;
    int x = 0;
    int y = N / 2;
    for (int i = 1; i <= N * N; i++) {
      mat[x][y] = i;
      x--;
      y++;
      if (x < 0) {
        x = N - 1;
      }
      if (y == N) {
        y = 0;
      }
      if (mat[x][y] != 0) {
        x++;
        y--;
        if (x == N) {
          x = 0;
        }
        if (y < 0) {
          y = N - 1;
        }
        x++;
      }
    }
    return mat;
  }
}
