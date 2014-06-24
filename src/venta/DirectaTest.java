package venta;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import producto.Presentacion;
import producto.Producto;
import static org.mockito.Mockito.*;

public class DirectaTest {
	
	Venta venta01 = new Directa();
	Producto productoMock01 = mock(Producto.class);
	Presentacion presentacionMock01 = mock(Presentacion.class);
	
	@Before
	public void setUp(){
		venta01.agregarProducto(presentacionMock01);
		venta01.agregarProducto(presentacionMock01, 4);
		
		when(presentacionMock01.precioUnitarioDeVenta()).thenReturn(10);
		
		venta01.confirmarVenta();
		
	}
	

	@Test
	public void testAgregarProducto() {
		assertEquals(5, venta01.getListaDeProductos().size());
	}
	
	@Test
	public void testImporte(){
		assertEquals(50, venta01.importe());
	}
	
	@Test
	public void testConCliente(){
		assertFalse(venta01.conCliente());
	}
	@Test
	public void testSinCliente(){
		assertTrue(venta01.sinCliente());
	}
	@Test
	public void testConfirmarVenta(){
		verify(presentacionMock01, times(5)).decrementarStock();
	}
	
}
