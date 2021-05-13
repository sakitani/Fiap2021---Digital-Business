package br.com.fiap.desconto.chainOfResponsibility;

import br.com.fiap.pedido.state.Pedido;

public class CalculadoraDesconto {
	
	//CHAIN OF RESPONSIBILITY
	
	public double calcular(Pedido pedido) {
		Desconto cadeiaDeDesconto = 
				new DescontoPorValor(new DescontoPorQuantidade(new SemDesconto()));
	return cadeiaDeDesconto.calcular(pedido);
	}
}
