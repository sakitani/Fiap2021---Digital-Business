package br.com.fiap.imposto.strategy;

import br.com.fiap.pedido.state.Pedido;

public class IPI implements Imposto{
	
	//STRATEGY
	
	private double imposto;
	@Override
	public double calcular(Pedido pedido) {
		imposto = pedido.getValor() * 0.5; 
		return imposto;
	}

}
