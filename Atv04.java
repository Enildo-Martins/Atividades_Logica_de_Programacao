package AtividadeDia13_08_2023;
/* Considere os seguintes vetores:

vetA = [ 0, 4, 2, 1, 5, 6, 2, 8, 1, 2, 1, 5, 6, 3, 0 ]
vetB = [ 1, 5, 7, 3, 1, 1, 5, 2, 8, 4, 6, 1, 4, 5, 3 ]
Com os vetores preenchidos, identifique o padrão e crie um algoritmo que tenha o seguinte
resultado:

vetC = [ -1, 9, 9, -2, 6, 7, -3, 10, 9, -2, 7, 6, 2, 8, 3 ] */

public class Atv04 {
	public static void main(String[] args) {
		int[] vetorA = { 0, 4, 2, 1, 5, 6, 2, 8, 1, 2, 1, 5, 6, 3, 0 };
		int[] vetorB = { 1, 5, 7, 3, 1, 1, 5, 2, 8, 4, 6, 1, 4, 5, 3 };
		int[] vetorC = new int[15];
		int cont = -1;

		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
		}

		for (int i = 0; i < vetorA.length; i += 3) {
			vetorC[i] = cont;
			if (cont > -3) {
				cont--;
			} else {
				cont++;
			}
			vetorC[12] = 2;
		}
		System.out.print("VetorC = [");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print("" + vetorC[i]);
			if (i < vetorC.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
