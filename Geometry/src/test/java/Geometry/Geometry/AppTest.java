package Geometry.Geometry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import dto.Geometria;

class AppTest {
	
	@Test
	public void testAreaTriangulo() {
		
		int r = Geometria.areatriangulo(2, 4);
		int esperado = 4 ;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testAreaRectangulo() {
		
		int r = Geometria.arearectangulo(2, 2);
		int esperado = 4 ;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testAreaPentagono() {
		
		int r = Geometria.areapentagono(2, 2);
		int esperado = 2 ;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testAreaRombo() {
		
		int r = Geometria.arearombo(2, 3);
		int esperado = 3 ;
		assertEquals(esperado, r);	
	}
	
	@Test
	public void testAreaRomboide() {		
		int r = Geometria.arearomboide(4, 5);
		int esperado = 20 ;
		assertEquals(esperado, r);	
	}

}
