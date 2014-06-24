package producto;

import java.util.ArrayList;
import java.util.List;


public class Producto {
	
	List<Presentacion> presentacion;

	String nombre;
	String descripcion;
	String marca;
	String tipoDeProducto;
	
	Producto(){
		presentacion = new ArrayList<Presentacion>();
	}
	
	
	public int precioUnitarioDeVenta() {
		// TODO Auto-generated method stub
		return 0;
	}

}
