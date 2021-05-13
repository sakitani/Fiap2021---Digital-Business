package br.com.fiap.desconto.templateMetrod;

import br.com.fiap.pedido.state.Pedido;

public class SemDesconto extends Desconto {
	
	//TEMPLATE METHOD

	public SemDesconto() {
		super(null);
	}

	@Override
	public double aplicar(Pedido pedido) {
		return 0;
	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return true;
	}

}
