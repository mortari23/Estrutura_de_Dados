// ------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : PROJETOS JAVA
// Ano/S: 2026/1S
// ------------------------------------

// VERSÃO 3
// - dois arquivos separados
// - ações realizadas por métodos separados do 'main'
// --------------------------------------------------

// importação de classe para leitura de dados do teclado -> NÃO PRECISA MAIS
//import java.util.Scanner;

// classe que contém o PROGRAMA PRINCIPAL ('main')
public class Lab_02_ProjetosJava_V3_APOS_AULA_Main {

	// PROGRAMA PRINCIPAL
	// ------------------
	public static void main(String[] args) throws Exception {
		// System.out.println("Hello, World!");

		// instanciação de um objeto da classe que contém os métodos do 'switch'
		Lab_02_ProjetosJava_V3_APOS_AULA_Acoes metodosSwitch =  
			new Lab_02_ProjetosJava_V3_APOS_AULA_Acoes();

		// criação de um objeto 'Scanner' para a interação com o teclado
		// (NÃO PRECISA MAIS, porque 'teclado' agora é um atributo da classe '...Acao')
		//Scanner teclado = new Scanner(System.in);

		// declaração de variáveis a serem usadas (independentemente da Ação)
		int escolha;

		// menu de escolha da Ação a ser executada
		do {

			// acionamento do método que apresenta o menu e retorna a escolha
			escolha = metodosSwitch.trataMenu();

			// avaliação da opção e acionamento da respectiva Ação
			switch (escolha) {

				case 1:
					// acionamento do método respectivo
					metodosSwitch.exibeValoresPares();
					break;

				case 2:
					// acionamento do método respectivo
					metodosSwitch.exibeDezCaracteres();
					break;

				case 3:
					// acionamento do método respectivo
					metodosSwitch.exibeMultiplosTres();
					break;

				case 4:
					// acionamento do método respectivo
					metodosSwitch.converteParaSegundos();
					break;

				case 5:
					// acionamento do método respectivo
					metodosSwitch.converteParaHorasMinutos();
					break;

				case 9:
					System.out.println("Sair ...\n");
					break;

				default:
					System.out.println("Opção inválida !  Tente novamente ...\n");
			}

		} while (escolha != 9);

		//teclado.close();  // desnecessário, pois neste Modo o 'main' não utiliza o 'Scanner'

		// identificação do autor do trabalho -> TAMBÉM PODE TORNAR-SE UM MÉTODO !!!
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("Disc.: ESTRUTURAS DE DADOS - 2026/1S");
		System.out.println("Lab. : PROJETOS JAVA");
		System.out.println("------------------------------------");
		System.out.println("Nome : CARLOS MAGNUS CARLSON FILHO");
		System.out.println("R.A. : 121 092 AAS P NNN");
		System.out.println("------------------------------------");
		System.out.println();

	}

}
