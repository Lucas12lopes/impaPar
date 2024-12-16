package positivoNegativo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//captura entrada do usuário
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
                
		//Estrutura repetitiva
		if (numero > 0) {

			System.out.println("O número " + numero + " É positivo");
		} else if (numero < 0) {
			System.out.println("O número " + numero + " È Negativo");
		} else {
			System.out.println("O número é zero.");
		}
		sc.close();
	}

}
