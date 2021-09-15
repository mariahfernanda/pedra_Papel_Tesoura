package pedraPapelTesoura;

import java.util.Random;
import java.util.Scanner;

public class JogoSorteio {

	public static void main(String[] args) {
		Random sorteio = new Random();

		Scanner leitor = new Scanner(System.in);

		int escolhaJogador;
		int numeroPartidas = 0;
		int placarJogador = 0, placarComputador = 0;
		int partidaAtual = 1;
		String jogarNovamente = "S";

		while (jogarNovamente.equals("S") || jogarNovamente.equals("s") || jogarNovamente.equals("sim")) {
			System.out.println("****************************");
			System.out.println("       ! JOKENPO !");
			System.out.println("****************************");
			System.out.println();
			System.out.print("Deseja jogar quantar rodadas? : ");
			numeroPartidas = leitor.nextInt();

			while (numeroPartidas < 3 || numeroPartidas % 2 == 0) {
				System.out
						.println("O número de partidas precisa ser ímpar e maior do que 3, para que haja um vencedor!");
				System.out.println();
				System.out.print("Deseja jogar quantar rodadas? :");
				numeroPartidas = leitor.nextInt();
				System.out.println();
			}
			System.out.println("****************************");
			System.out.println();
			System.out.println("1- Pedra");
			System.out.println("2- Papel");
			System.out.println("3- Tesoura");
			System.out.println();
			while (placarComputador < numeroPartidas / 2 + 1 && placarJogador < numeroPartidas / 2 + 1) {

				int numeroSorteio = sorteio.nextInt(3) + 1;

				System.out.println("****************************");
				System.out.println("Partida: " + partidaAtual);
				System.out.println();
				System.out.println("Escolha sua jogada: ");
				escolhaJogador = leitor.nextInt();

				if (escolhaJogador == 1 || escolhaJogador == 2 || escolhaJogador == 3) {

					if (escolhaJogador == 1) {
						System.out.println("Você escolheu Pedra!");
						System.out.println();

					} else if (escolhaJogador == 2) {
						System.out.println("Você escolheu Papel!");
						System.out.println();

					} else {
						System.out.println("Você escolheu Tesoura!");
						System.out.println();
					}

					if (numeroSorteio == 1) {
						System.out.println("O computador escolheu Pedra!");
						System.out.println();

					} else if (numeroSorteio == 2) {
						System.out.println("O computador escolheu Papel!");
						System.out.println();

					} else {
						System.out.println("O computador escolheu Tesoura!");
						System.out.println();
					}
					System.out.println();

					if (escolhaJogador == 1 && numeroSorteio == 3 || escolhaJogador == 2 && numeroSorteio == 1
							|| escolhaJogador == 3 && numeroSorteio == 2) {

						System.out.println("Você ganhou!");
						placarJogador++;

					} else if (numeroSorteio == 1 && escolhaJogador == 3 || numeroSorteio == 2 && escolhaJogador == 1
							|| numeroSorteio == 3 && escolhaJogador == 2) {

						System.out.println("O computador ganhou!");
						placarComputador++;

					} else {
						System.out.println("Empate!");

					}
				} else {
					System.out.println("Essa escolha não é válida");
				}

				System.out.printf("%d - %d", placarJogador, placarComputador);
				System.out.println();
				System.out.println();
				partidaAtual++;

			}
			System.out.println("---------------------------");
			System.out.println("Deseja jogar novamente? ");
			jogarNovamente = leitor.next();
			System.out.println("---------------------------");
			System.out.println();

			placarJogador = 0;
			placarComputador = 0;
			numeroPartidas = 0;
			partidaAtual = 1;
			escolhaJogador = 0;
		}

		leitor.close();

	}
}
