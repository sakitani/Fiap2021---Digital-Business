package br.com.fiap.desconto.templateMetrod;

import br.com.fiap.pedido.state.Pedido;

public abstract class Desconto {
	
	//TEMPLATE METHOD
	
	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	protected abstract double aplicar(Pedido pedido);
	protected abstract boolean deveAplicar(Pedido pedido);
	
	public double calcular(Pedido pedido) {
		if(deveAplicar(pedido)) { 
			return aplicar(pedido);
		}
		return proximo.calcular(pedido);
	}


}
