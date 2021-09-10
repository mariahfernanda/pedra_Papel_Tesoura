package pedraPapelTesoura;

import java.util.Random;
import java.util.Scanner;

public class JogoSorteio {

	public static void main(String[] args) {
	

			Scanner ler = new Scanner(System.in);
			Random random = new Random();

			int qtdDeRodadas;
			int escolhaJogada;
			int vitoriasRodadasJogador = 0;
			int vitoriasRodadasMaquina = 0;

			System.out.println("---------------------------");
			System.out.println("      J O K E N P O ");
			System.out.println("---------------------------");
			System.out.println();

			String escolhaDoUsuario = "s";
			int contador = 0;

			while (escolhaDoUsuario.equalsIgnoreCase("s")) {

				System.out.print("Digite a quantidade de rodadas: ");
				qtdDeRodadas = ler.nextInt();
				System.out.println("");
				System.out.println("---------------------------");

				while (contador < qtdDeRodadas) {

					while (qtdDeRodadas % 2 == 0 || qtdDeRodadas < 3) {
						System.out.println("Por favor não digite números pares ou menores e iguais a 3 !!!");
						System.out.println();
						System.out.println("Digite a quantidade de rodadas: ");
						qtdDeRodadas = ler.nextInt();
					}

					System.out.println("Escolha um: ");
					System.out.println("[1] - Pedra");
					System.out.println("[2] - Papel");
					System.out.println("[3] - Tesoura");
					System.out.println();

					System.out.print("Digite o valor escolhido: ");
					escolhaJogada = ler.nextInt();
					System.out.println("");

					if (escolhaJogada == 1) {
						System.out.println("Você escolheu  pedra.");

					} else if (escolhaJogada == 2) {
						System.out.println("Você escolheu papel.");

					} else if (escolhaJogada == 3) {
						System.out.println("Você escolheu tesoura.");
						System.out.println();
					}

					int sorte = random.nextInt(3) + 1;
					
					if (sorte == 1) {
						System.out.println("O computador escolheu pedra.");

					} else if (sorte == 2) {
						System.out.println("O computador escolheu papel.");

					} else if (sorte == 3) {
						System.out.println("O computador escolheu tesoura.");
						System.out.println();
					}

					while (escolhaJogada != 1 && escolhaJogada != 2 && escolhaJogada != 3) {
						System.out.println("Escolhau um valor de 1 até 3: ");
						System.out.println();

						System.out.println("Escolha um: ");
						System.out.println("[1] - Pedra");
						System.out.println("[2] - Papel");
						System.out.println("[3] - Tesoura");
						System.out.println();

						System.out.print("Digite o valor escolhido: ");
						escolhaJogada = ler.nextInt();
						System.out.println("");
						
					}

					if ((escolhaJogada == 1 && sorte == 2) || (escolhaJogada == 2 && sorte == 3)
							|| (escolhaJogada == 3 && sorte == 1)) {
						System.out.println();
						System.out.println("Você perdeu essa rodada! :(");
						System.out.println();
					} else if ((escolhaJogada == 1 && sorte == 3) || (escolhaJogada == 2 && sorte == 1)
							|| (escolhaJogada == 3 && sorte == 2)) {
						System.out.println();
						System.out.println("Você ganhou essa rodada! :)");
						System.out.println();
					} else {
						System.out.println();
						System.out.println("Essa rodada empatou");
						System.out.println();
					}

					if ((escolhaJogada == 1 && sorte == 2) || (escolhaJogada == 2 && sorte == 3)
							|| (escolhaJogada == 3 && sorte == 1)) {
						vitoriasRodadasMaquina = vitoriasRodadasMaquina + 1;

					} else if ((escolhaJogada == 1 && sorte == 3) || (escolhaJogada == 2 && sorte == 1)
							|| (escolhaJogada == 3 && sorte == 2)) {
						vitoriasRodadasJogador = vitoriasRodadasJogador + 1;

					} else {
						System.out.println("Essa rodada empatou");
					}

					contador++;
				}
				if (vitoriasRodadasMaquina > vitoriasRodadasJogador) {
					System.out.println("O computador ganhou :(");
				} else {
					System.out.println("Você ganhou :)");
				}


				while (!escolhaDoUsuario.equalsIgnoreCase("s") && !escolhaDoUsuario.equalsIgnoreCase("n")) {
					System.out.println("Por favor não digite S caso queira continuar jogando e N caso queira parar!!!");
					System.out.println();
					escolhaDoUsuario = ler.next();
				}
				
				
					System.out.print("Você deseja jogar mais? S/N: ");
					System.out.print("");
					escolhaDoUsuario = ler.next();
				
				
	
		}
			ler.close();
	}
}


