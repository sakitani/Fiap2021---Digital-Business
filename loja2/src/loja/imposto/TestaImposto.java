package loja.imposto;

import java.math.BigDecimal;

import loja.Pedido;

public class TestaImposto {
	public static void main(String[] args) {
		CalculadoraDeImposto calculadoraDeImposto = 
				new CalculadoraDeImposto(new IPI());
		Pedido pedido = new Pedido(new BigDecimal("100"));
		
		BigDecimal imposto = calculadoraDeImposto.calcular(pedido);
		
		System.out.println(imposto);
		
		
		//trocar a estratégia
		calculadoraDeImposto.setImposto(new ICMS());
		imposto = calculadoraDeImposto.calcular(pedido);
		System.out.println(imposto);
	}
}
