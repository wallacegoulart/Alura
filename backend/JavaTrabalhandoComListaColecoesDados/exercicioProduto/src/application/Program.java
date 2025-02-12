package application;

import java.util.ArrayList;

import entities.Produto;
import entities.ProdutoPerecivel;

public class Program {

	public static void main(String[] args) {
		
		
		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		
		Produto prod01 = new Produto();
		prod01.setNome("maca");
		prod01.setPreco(1.50);
		prod01.setQuantidade(100);
		
		Produto prod02 = new Produto();
		prod02.setNome("banana");
		prod02.setPreco(3.50);
		prod02.setQuantidade(400);
		
		Produto prod03 = new Produto();
		prod03.setNome("melão");
		prod03.setPreco(5.50);
		prod03.setQuantidade(1000);
		
		Produto prod04 = new Produto();
		prod04.setNome("abacaxi");
		prod04.setPreco(7.00);
		prod04.setQuantidade(400);
		
		Produto prod05 = new Produto("laranja",2.20,3402);
		
		ProdutoPerecivel prod06 = new ProdutoPerecivel("Danone",6.70,70,"01/04/2025");
		
		
		listaDeProdutos.add(prod01);
		listaDeProdutos.add(prod02);
		listaDeProdutos.add(prod03);
		listaDeProdutos.add(prod04);
		listaDeProdutos.add(prod05);
		listaDeProdutos.add(prod06);
		
		
		System.out.println("Quantidade de produtos são: " + listaDeProdutos.size());
		
		for(Produto produtos: listaDeProdutos){
			System.out.println(produtos);
		}
		
	}

}
