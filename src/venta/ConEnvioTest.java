package venta;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cliente.Cliente;
import producto.Presentacion;
import producto.Producto;
import static org.mockito.Mockito.*;

public class ConEnvioTest {

	
	Producto productoMock01 = mock(Producto.class);
	Presentacion presentacionMock01 = mock(Presentacion.class);
	Cliente clienteMock01 = mock(Cliente.class);
	
	Venta venta01 = new ConEnvio(clienteMock01);
	
	@Before
	public void setUp(){
		venta01.agregarProducto(presentacionMock01);
		venta01.agregarProducto(presentacionMock01, 4);
		
		when(presentacionMock01.precioUnitarioDeVenta()).thenReturn(10);
		
		venta01.confirmarVenta();
		
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
