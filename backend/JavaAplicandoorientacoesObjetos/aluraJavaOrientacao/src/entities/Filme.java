package entities;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
	
	private String diretor;

	
	public Filme(String nome, int anoLancamento) {
		super(nome, anoLancamento);
		// TODO Auto-generated constructor stub
	}

	
	public String getDiretor(){
		return diretor;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	
	@Override
	public int getClassificacao() {
		return (int) pegaMedia()/2;
	}
	
	@Override
	public String toString() {
		return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")" ;
	}
	
}
