package pedraPapelTesoura;

import java.util.Random;
import java.util.Scanner;

public class JogoSorteio {

	public static void main(String[] args) {
	
		
		Scanner leitor = new Scanner(System.in);		
		
		Random sorteio = new Random();
		int valorSorteado = sorteio.nextInt(3)+1;
		
		System.out.println("1:Pedra");
		System.out.println("2:Papel");
		System.out.println("3:Tesoura");
		System.out.println();
		
		System.out.print("Qual a sua escolha: " );
		int numero = leitor.nextInt();
		
		System.out.println("Escolha do computador: " + valorSorteado);
		System.out.println("--------------------------------");
		System.out.println();
		
	
		if (numero == 1 && valorSorteado == 2 ) {
			System.out.println("Você escolheu pedra");
			System.out.println("Computador escolheu papel");
			System.out.println();
			System.out.println("Computador ganhou!");
			
		}else if (numero == 1 && valorSorteado == 3) {
			System.out.println("Você escolheu pedra");
			System.out.println("Computador escolheu tesoura");
			System.out.println();
			System.out.println("Você ganhou !");
			
		} else if (numero == 2 && valorSorteado == 3) {
			System.out.println("Você escolheu papel");
			System.out.println("Computador escolheu tesoura");
			System.out.println();
			System.out.println("Computador ganhor!");
			
		} else if (numero == 2 && valorSorteado == 1) {
			System.out.println("Você escolheu papel");
			System.out.println("Computador escolheu pedra");
			System.out.println();
			System.out.println("Você ganhou!");
			
		}else if (numero == 3 && valorSorteado == 1) {
			System.out.println("Você escolheu tesoura");
			System.out.println("Computador escolheu pedra");
			System.out.println();
			System.out.println("Computador ganhou");
			
		}else if (numero == 3 && valorSorteado == 2) {
			System.out.println("Você escolheu tesoura");
			System.out.println("Computador escolheu papel");
			System.out.println();
			System.out.println("Você ganhou!");
			
		}else {
			System.out.println("Empatou");
		}
		
		
		
	}

	}

