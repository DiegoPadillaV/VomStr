package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vomistr.Vomistr;

class VmstrTest {

	@Test
	void testEjecutivo() {
	//para lograr este test se debe generar un getter del array	
		Vomistr.inicializarObjetos();
		int cantidadEjecutivos = Vomistr.getEjecutivos().size();
		assertEquals(2,cantidadEjecutivos);
		
	}

}
