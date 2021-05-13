package br.com.fiap.situacao;

import java.math.BigDecimal;

import br.com.fiap.pedido.state.EmailListener;
import br.com.fiap.pedido.state.LogListener;
import br.com.fiap.pedido.state.Pedido;



public class TestaSituacao {
	
	public static void main(String[] args) {
		Pedido pedido = new Pedido(100);
		pedido.handler.subscribe(new EmailListener());
		pedido.handler.subscribe(new LogListener());
		
		pedido.pagar();
		pedido.entregar();
		pedido.abrirChamado();
	}

}
