package br.com.fiap.desconto.chainOfResponsibility;

import br.com.fiap.pedido.state.Pedido;

public class TesteDesconto {
	public static void main(String[] args) {
		
		//CHAIN OF RESPONSIBILITY
	
		CalculadoraDesconto calculadora = new CalculadoraDesconto();
		Pedido pedido = new Pedido(400, 15);
		
		double desconto = calculadora.calcular(pedido);
		
		System.out.println(desconto);
		
		
	}
}
