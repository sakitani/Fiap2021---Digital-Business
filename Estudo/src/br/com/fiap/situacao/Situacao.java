package br.com.fiap.situacao;


import br.com.fiap.pedido.state.Pedido;
import br.com.fiap.pedido.state.StateException;


public abstract class Situacao {
	
	public abstract void abrirChamado();
	
	public void pagar(Pedido pedido) {
		throw new StateException("não pode transitar para pago");
	}
	
	public void entregar(Pedido pedido) {
		throw new StateException("não pode transitar para entregue");
	}
	
	public void cancelar(Pedido pedido) {
		throw new StateException("não pode transitar para cancelado");
	}
	
	public void reabrir(Pedido pedido) {
		throw new StateException("não pode transitar para aberto");
	}

}
