package br.com.fiap.desconto.chainOfResponsibility;

import br.com.fiap.pedido.state.Pedido;

public abstract class Desconto {
	
	//CHAIN OF RESPONSIBILITY
	
	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public abstract double calcular(Pedido pedido);

}
