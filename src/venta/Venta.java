package venta;
import java.util.ArrayList;
import java.util.List;

import cliente.Cliente;
import producto.Presentacion;


public abstract class Venta {

	private List<Presentacion> listaDeProductosEnCarro;
	private Cliente cliente;
	
	Venta(){
		listaDeProductosEnCarro = new ArrayList<Presentacion>();
		cliente = null;
	}
	
	public void asignarCliente(Cliente unCliente){
		this.cliente=unCliente;
	}
	
	public void agregarProducto(Presentacion unProducto){
		this.listaDeProductosEnCarro.add(unProducto);
	}
	
	public void agregarProducto(Presentacion unProducto,int unaCantidad){
		for (int i=0;i<unaCantidad;i++){
			agregarProducto(unProducto);
		}
	}
	
	public List<Presentacion> getListaDeProductos(){
		return this.listaDeProductosEnCarro;
	}
	
	public int importe(){
		int total=0;
		total+=this.importeTotalDeVenta();
		return total;
	}
	
	private int importeTotalDeVenta() {
		int total=0;
		for (Presentacion o : this.getListaDeProductos()){
			total+=o.precioUnitarioDeVenta();
		}
		return total;
	}
	
	public boolean conCliente(){
		return (this.cliente!=null);
	}
	public boolean sinCliente(){
		return !this.conCliente();
	}
	
	protected void descontarStock(){
		for (Presentacion o : this.getListaDeProductos()){
			o.decrementarStock();
		}
	}
	
	public void confirmarVenta(){
		this.descontarStock();
	}
	
}
