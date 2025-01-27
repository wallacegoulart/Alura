package application;

import calculos.CalculadoraDeTempo;
import entities.Filme;

public class Program {

	public static void main(String[] args) {
		
		Filme meuFilme = new Filme();
		
		meuFilme.setNome("O Poderoso Chefao");
		meuFilme.setAnoLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180);
		
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(5);
		meuFilme.avalia(8);
		meuFilme.avalia(9);
		meuFilme.avalia(10);
		meuFilme.avalia(10);
		
		
		
		CalculadoraDeTempo calc = new CalculadoraDeTempo();
		calc.inclui(meuFilme);
		
		System.out.println(calc.getTempoTotal());
		
		

	}

}
