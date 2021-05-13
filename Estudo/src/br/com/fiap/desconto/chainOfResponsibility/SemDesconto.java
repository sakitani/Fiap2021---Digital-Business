package br.com.fiap.desconto.chainOfResponsibility;

import br.com.fiap.pedido.state.Pedido;

public class SemDesconto extends Desconto {
	
	//CHAIN OF RESPONSIBILITY

	public SemDesconto() {
		super(null);
	}

	@Override
	public double calcular(Pedido pedido) {
		return 0;
	}

}
