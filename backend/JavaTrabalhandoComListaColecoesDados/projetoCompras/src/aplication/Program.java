package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o limite do Cartao: ");
		float limiteCartao = sc.nextFloat();
		
		
		System.out.println("Valor da compra: ");
		float valorCompra = sc.nextFloat();
		
		System.out.println("Descricao da compra: ");
		String descricaoCompra = sc.next();
		
		
		float saldoRestanteCartao = limiteCartao - valorCompra ;
		
		System.out.printf("Saldo Inicial  R$:%.2f \n",limiteCartao);
		
		System.out.printf("%s - R$:%.2f \n",descricaoCompra,valorCompra);
		System.out.printf("Saldo restante R$:%.2f\n",saldoRestanteCartao);
		
		
		sc.close();
		
	}

}
