package application;

import java.util.ArrayList;

import modelo.Pessoa;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
		
		Pessoa pessoa01 = new Pessoa();
		pessoa01.setNome("Wallace Goulart");
		pessoa01.setIdade(35);
		
		Pessoa pessoa02 = new Pessoa();
		pessoa02.setNome("Larisse Silva");
		pessoa02.setIdade(26);
		
		Pessoa pessoa03 = new Pessoa();
		pessoa03.setNome("Sergio Henrique");
		pessoa02.setIdade(30);
		
		
		listaDePessoas.add(pessoa01);
		listaDePessoas.add(pessoa02);
		listaDePessoas.add(pessoa03);
		
		System.out.println("Tamanho da lista é: " + listaDePessoas.size());
		System.out.println("Primeira pessoa:  " + listaDePessoas.get(0).toString());
		
		for(Pessoa pessoa : listaDePessoas){
			System.out.println(pessoa);
		}
		
		
		
	}

}
