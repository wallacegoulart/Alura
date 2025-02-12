package entities;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	
	public Produto(String nome, double preco, int quantidade) {
		this.setNome(nome);
		this.setPreco(preco);
		this.setQuantidade(quantidade);
	}
	
	public Produto() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double valorTotalPorPorduto() {
		return Math.round(this.getPreco() * this.getQuantidade()); 
	}
	
	@Override
	public String toString(){
		return "O produto " + this.getNome() + " tem o valor R$: " + this.getPreco() 
		+ " e e no estoque temos: " + this.getQuantidade()
		+ ", e o valor total que temos é de R$  " +  this.valorTotalPorPorduto();	
		}

}
