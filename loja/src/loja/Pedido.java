package loja;

import java.math.BigDecimal;

public class Pedido {
	private BigDecimal valor;
	private int totalDeItens;

	public Pedido(BigDecimal valor) {
		this.valor = valor;
		this.totalDeItens = 1;
	}

	public Pedido(BigDecimal valor, int totalDeItens) {
		this.valor = valor;
		this.totalDeItens = totalDeItens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getTotalDeItens() {
		return totalDeItens;
	}
	
	
		
	
	
}
