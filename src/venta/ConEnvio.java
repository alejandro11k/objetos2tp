package venta;

import cliente.Cliente;

public class ConEnvio extends Venta{

	ConEnvio(Cliente unCliente){
		this.asignarCliente(unCliente);
	}
	
	@Override
	public void confirmarVenta(){
		
		this.descontarStock();
	}
}
