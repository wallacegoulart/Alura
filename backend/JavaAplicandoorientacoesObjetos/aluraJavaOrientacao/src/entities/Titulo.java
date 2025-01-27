package entities;

public class Titulo {
	

	private String nome;
	private int anoLancamento;
	private boolean incluiNoPlano;
	private double somaDeAvalicoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	
	public boolean isIncluiNoPlano() {
		return incluiNoPlano;
	}

	public void setIncluiNoPlano(boolean incluiNoPlano) {
		this.incluiNoPlano = incluiNoPlano;
	}

	
	
	
	public void exibeFichaTecnica() {
		
		System.out.println("Nome do filme: " +nome);
		System.out.println("Ano de lancamento do filme: " +anoLancamento);
		
	}
	
	public void avalia(double nota) {
		somaDeAvalicoes+=nota;
		totalDeAvaliacoes++;
	}
	
	public double pegaMedia() {	
		return somaDeAvalicoes / totalDeAvaliacoes;
	}

}
