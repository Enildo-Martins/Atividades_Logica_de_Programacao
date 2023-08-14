package AtividadeDia13_08_2023;

/* Crie um algoritmo que preencha o vetor de 20 posições da seguinte forma  
1 0 4 0 9 0 16 0 25 0 36 0 49 0 64 0 81 0 100 0 */

public class Atv01 {
	public static void main(String[] args) {
		int[] vetor = new int [20];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 100);  
			System.out.println(vetor[i]);
		}
		
		System.out.println("");
		for(int i = 0; i < vetor.length; i++) {
			int cont = 0;
			for(int j = 0; j < vetor.length; j++) {
				if(vetor[i] < vetor[j]) {
					cont = vetor[j];
					vetor[j] = vetor[i]; 
					vetor[i] = cont;
				}
			}
		}
		for(int i = 0; i < vetor.length; i += 2) {
			vetor[i + 1] = 0;
		}
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
	}
}
