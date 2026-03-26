// -------------------------------------
// Prof.: CARLOS - FATEC S. J. Rio Preto
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Lab. : ARRAYS de OBJETOS em JAVA
// Ano/S: 2026/1S
// -------------------------------------

// classe que modela a entidade 'Aluno'
public class Aluno {

	// Atributos
	// ---------
	private String nome;
	private String RA;
	private String curso;

	// Método Construtor
	// -----------------
	Aluno (String nome, String RA, String curso){
		this.nome  = nome;
		this.RA    = RA;
		this.curso = curso;
	}

	// Métodos 'getters' e 'setters' (sempre 'publico')
	// ------------------------------------------------
	// 1.atributo 'nome'
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	//2.atributo 'RA'
	public String getRA() {
		return RA;
	}
	public void setRA(String RA) {
		this.RA = RA;
	}
	//3 atributo 'curso'
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}



	// Outros métodos ('public' ou 'private', conforme a necessidade
	// -------------------------------------------------------------

	// método para exibição dos dados do Aluno
	public void exibeDadosAluno() {
	
		// identificação do autor do trabalho
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Aluno: " + nome); // nome  do aluno
		System.out.println("R.A. : " + RA); // R.A.  do aluno
		System.out.println("Curso: " + curso); // curso do aluno
		System.out.println("---------------------------------");
		System.out.println();
	
		// finalização (desnecessário neste caso, pois é procedimento 'void')
		return;	
	}
    
}
