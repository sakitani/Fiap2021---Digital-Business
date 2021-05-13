package br.com.fiap.desconto.chainOfResponsibility;

import br.com.fiap.pedido.state.Pedido;

public class DescontoPorValor extends Desconto {
	
	//CHAIN OF RESPONSIBILITY

	public DescontoPorValor(Desconto proximo) {
		super(proximo);
	}

	private double desconto;
	
	@Override
	public double calcular(Pedido pedido) {
		if(pedido.getValor() > 500) {
		desconto = pedido.getValor() * 0.10;
			return desconto;
		}
		return proximo.calcular(pedido);
	}

}
