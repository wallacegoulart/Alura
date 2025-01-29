package application;

import java.util.ArrayList;

import calculos.CalculadoraDeTempo;
import calculos.FiltroRecomendacao;
import entities.Episodio;
import entities.Filme;
import entities.Serie;

public class Program {

	public static void main(String[] args) {
		
		Filme meuFilme = new Filme("O poderoso chefão",1970);
        //meuFilme.setNome("O poderoso chefão");
        //meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());


        Filme outroFilme = new Filme("Avatar",2023);
       // outroFilme.setNome("Avatar");
        //outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);


		
		ArrayList<Filme> listaFilmes = new ArrayList<>();
		
		listaFilmes.add(meuFilme);
		listaFilmes.add(outroFilme);
		
		System.out.println("Tamanho da Lista: " + listaFilmes.size());
		System.out.println(listaFilmes);
		System.out.println("toString do filme "+ listaFilmes.get(0).toString());
		

	}

}
