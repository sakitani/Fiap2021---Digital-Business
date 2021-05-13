package br.com.fiap.imposto.strategy;

import br.com.fiap.pedido.state.Pedido;

public class TesteImposto {
	public static void main(String[] args) {
		
		//STRATEGY
		
		CalculadoraImposto calculadoImposto = new CalculadoraImposto(new ICMS());
		
		Pedido pedido = new Pedido(100);
		
		double imposto = calculadoImposto.calcular(pedido);
		
		System.out.println(imposto);
		
		calculadoImposto.setImposto(new IPI());
		imposto = calculadoImposto.calcular(pedido);
		System.out.println(imposto);
		
	}

}
