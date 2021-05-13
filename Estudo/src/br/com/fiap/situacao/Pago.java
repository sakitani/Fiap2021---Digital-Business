package br.com.fiap.situacao;

import br.com.fiap.pedido.state.Pedido;

public class Pago extends Situacao{

	@Override
	public void abrirChamado() {
		System.out.println("chamado para logistica");		
	}

	@Override
	public void entregar(Pedido pedido) {
		pedido.setSituacao(new Entregue());
	}

	@Override
	public void cancelar(Pedido pedido) {
		pedido.setSituacao(new Cancelado());
	}
	
	

}
