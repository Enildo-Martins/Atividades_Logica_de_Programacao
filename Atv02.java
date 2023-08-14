package AtividadeDia13_08_2023;

/*Crie um vetor de 16 posições, após isso, realize a média de todos os valores dos índices pares
desse vetor.*/

public class Atv02 {
	public static void main(String[] args) {
		int[] vetor = new int[16];
		int contador = 0;
		int quantNum = 0;
		int total = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 10);  
			System.out.println(vetor[i]);
		}
		
		System.out.println("");
		
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				contador += vetor[i];
				quantNum++;
			}
			System.out.println(contador);
		}
		System.out.println("");
		total = contador / quantNum;
		System.out.println(total);
	}

}
