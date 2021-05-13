package br.com.fiap.desconto.templateMetrod;

import br.com.fiap.pedido.state.Pedido;

public class DescontoPorQuantidade extends Desconto {
	
	//TEMPLATE METHOD
	
	public DescontoPorQuantidade(Desconto proximo) {
		super(proximo);
	}
	
	private double desconto;
	
	@Override
	public double aplicar(Pedido pedido) {
		desconto = pedido.getValor() * 0.05;
			return desconto;
		}


	@Override
	protected boolean deveAplicar(Pedido pedido) {
		if(pedido.getQuantidade() > 10) {
		return true;
		}
		return false;
	}
	

}
