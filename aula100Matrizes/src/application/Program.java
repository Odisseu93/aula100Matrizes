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
					System.out.println("Position: " + i + "," + j);//Posi��o
					if ((j < m) && (j >= 0))
						System.out.println("Left: " + mat[i][j - 1]);//valida��o da posi��o a esquerda
					if (j < n)
						System.out.println("Right: " + mat[i][j + j]);//valida��o da posi��o a direita
					if (i > 0)
						System.out.println("Up: " + mat[i - 1][j]);//valida��o da posi��o acima
					if (i < n)
						System.out.println("Down: " + mat[i + 1][j]);//valida��o da posi��o abaixo
				}
			}
		}
		sc.close();
	}
}
