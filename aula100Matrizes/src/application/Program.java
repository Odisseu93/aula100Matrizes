package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] mat = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == x) {// verifica e valor da matriz da match com o x.
					System.out.println("Position: " + i + "," + j);//Posição
					if ((j < m) && (j >= 0))
						System.out.println("Left: " + mat[i][j - 1]);//validação da posição a esquerda
					if (j < n)
						System.out.println("Right: " + mat[i][j + j]);//validação da posição a direita
					if (i > 0)
						System.out.println("Up: " + mat[i - 1][j]);//validação da posição acima
					if (i < n)
						System.out.println("Down: " + mat[i + 1][j]);//validação da posição abaixo
				}
			}
		}
		sc.close();
	}
}
