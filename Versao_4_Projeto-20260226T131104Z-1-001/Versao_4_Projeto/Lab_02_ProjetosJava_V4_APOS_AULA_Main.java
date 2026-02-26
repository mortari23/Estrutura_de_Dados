// ------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : PROJETOS JAVA
// Ano/S: 2026/1S
// ------------------------------------

// VERSÃO 4 (antes da aula): idem final da versão 3
// - dois arquivos separados
// - ações realizadas por métodos separados do 'main'
// --------------------------------------------------

// importação de classe para leitura de dados do teclado -> NÃO PRECISA MAIS
//import java.util.Scanner;

// classe que contém o PROGRAMA PRINCIPAL ('main')
public class Lab_02_ProjetosJava_V4_APOS_AULA_Main {

	// PROGRAMA PRINCIPAL
	// ------------------
	public static void main(String[] args) throws Exception {
		//Instanciação de um objeto de classe "LabCoordenador"
		LabCoordenador coord = new LabCoordenador();
		// acionamento do método 'da entrada' do objeto '...Coordenador'
		coord.executaTudo();
	}

}
