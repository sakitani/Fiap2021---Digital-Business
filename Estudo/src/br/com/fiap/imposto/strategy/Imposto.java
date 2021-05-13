package br.com.fiap.imposto.strategy;

import br.com.fiap.pedido.state.Pedido;

public interface Imposto {
	
	//STRATEGY
	
	public double calcular(Pedido pedido);

}
