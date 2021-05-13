package br.com.fiap.pedido.state;

import br.com.fiap.situacao.Aberto;
import br.com.fiap.situacao.Situacao;

public class Pedido {
	
	private double valor;  
	private int quantidade; 
	
//	public Pedido(double valor, int quantidade) {
//		this.valor = valor;
//		this.quantidade = quantidade;
//	}
//
//	public Pedido(double valor) {
//		this.valor = valor;
//	}

	public double getValor() {
		return valor;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
// -------------------------------------------------------------------------
	
	private Situacao situacao;
	public PedidoHandler handler;
	
	public void abrirChamado() {
		this.situacao.abrirChamado();	
	}

	public Pedido(double valor) {
		this.valor = valor;
		this.quantidade = 1;
		this.situacao = new Aberto();
		this.handler = new PedidoHandler();
	}

	public Pedido(double valor, int totalDeItens) {
		this.valor = valor;
		this.quantidade = totalDeItens;
		this.situacao = new Aberto();
		this.handler = new PedidoHandler();
	}


	public void setSituacao(Situacao situacao) {
		this.handler.notify(this);
		this.situacao = situacao;
	}
	
	public void pagar() {
		this.situacao.pagar(this);
	}
	
	public void entregar() {
		this.situacao.entregar(this);
	}
	

}
