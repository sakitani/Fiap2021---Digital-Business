package br.com.fiap.imposto.strategy;

import br.com.fiap.pedido.state.Pedido;

public class ICMS implements Imposto {
	
	//STRATEGY
	
	private double imposto;
	@Override
	public double calcular(Pedido pedido) {
		imposto = pedido.getValor() * 0.1; 
		return imposto;
	}
	

}
