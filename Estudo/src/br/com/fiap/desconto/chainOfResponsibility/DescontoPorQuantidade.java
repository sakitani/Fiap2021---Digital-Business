package br.com.fiap.desconto.chainOfResponsibility;

import br.com.fiap.pedido.state.Pedido;

public class DescontoPorQuantidade extends Desconto {
	
	//CHAIN OF RESPONSIBILITY
	
	public DescontoPorQuantidade(Desconto proximo) {
		super(proximo);
	}
	
	private double desconto;
	
	@Override
	public double calcular(Pedido pedido) {
		if(pedido.getQuantidade() > 10) {
		desconto = pedido.getValor() * 0.05;
			return desconto;
		}
		return proximo.calcular(pedido);
	}
	

}
