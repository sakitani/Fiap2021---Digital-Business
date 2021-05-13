package br.com.fiap.desconto.templateMetrod;

import br.com.fiap.pedido.state.Pedido;

public class DescontoPorValor extends Desconto {
	
	//TEMPLATE METHOD

	public DescontoPorValor(Desconto proximo) {
		super(proximo);
	}

	private double desconto;
	
	@Override
	public double aplicar(Pedido pedido) {
		desconto = pedido.getValor() * 0.10;
			return desconto;
	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		if(pedido.getValor() > 500) {
		return true;
	}
		return false;
	}}
