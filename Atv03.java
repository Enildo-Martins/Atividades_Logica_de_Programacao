package AtividadeDia13_08_2023;
/*Crie um vetor de 10 posições que será preenchido de forma aleatória com valores de 0 a 10. A
partir desse vetor, construa um novo com a seguinte lógica:
novoVetor = [indice0+indice1, indice2+indice3, indice4+indice5, …, indice n-1+indice n ]
Por exemplo, considere o seguinte vetor:
vetor = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
O resultado do novo vetor, utilizando a lógica proposta:
novoVetor = [1+2, 3+4, 5+6, 7+8, 9+10] =&gt; [3, 7, 11, 15, 19]; */

public class Atv03 {
	public static void main(String[] args) {
		int vetor[] = new int[10];
		int novoVetor[] = new int [10 / 2];
		int cont =0;
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * 10);  
			System.out.println(vetor[i]);
		}
		
		for(int i = 0; i < novoVetor.length; i++) {
			novoVetor[i] = vetor[i + cont] + vetor[i + +cont + 1];
			cont++;
		}
		
		System.out.println("");
		for(int i = 0; i < novoVetor.length; i++) {  
			System.out.println(novoVetor[i]);
		}
		
	}
}
