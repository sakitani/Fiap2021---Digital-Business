package loja;

public class Situacao {
	
	public void abrirChamado() {
	}
	
	/* estados do PEDIDO:
	 * aberto
	 * pago
	 * entregue
	 * cancelado
	 */
	
	public void pagar(Pedido pedido) {
		throw new StateException("não pode transmitir para pago");
	}


	

}
