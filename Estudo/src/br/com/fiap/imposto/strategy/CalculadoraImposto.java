package br.com.fiap.imposto.strategy;

import br.com.fiap.pedido.state.Pedido;

public class CalculadoraImposto {
	
	//STRATEGY
	
	private Imposto imposto;

	public CalculadoraImposto(Imposto imposto) {
		this.imposto = imposto;
	}
	
	public double calcular(Pedido pedido) {
		return imposto.calcular(pedido);
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}
	
	
	

}
