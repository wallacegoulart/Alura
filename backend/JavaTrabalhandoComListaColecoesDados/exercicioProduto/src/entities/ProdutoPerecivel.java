package entities;

public class ProdutoPerecivel extends Produto {
	
	private String dataValidade;
	
	public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
		super(nome,preco,quantidade);
		this.setDataValidade(dataValidade);
		
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	
	@Override
	public String toString() {
		return "O produto " + this.getNome() + " tem o valor R$: " + this.getPreco() 
		+ " e e no estoque temos: " + this.getQuantidade()
		+ ", e o valor total que temos é de R$  " +  this.valorTotalPorPorduto()	
		+" data de validade é: " + this.getDataValidade();
		}

	}
	
	
