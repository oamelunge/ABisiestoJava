import static org.junit.Assert.*;

import org.junit.Test;


public class TestAnioBisiesto {

	
	public boolean  verificarBisiesto(int anio)
	{
		CalculadorBisiesto cBisiesto = new CalculadorBisiesto(anio);
		return cBisiesto.value();
	}
	
	@Test
	public void test_anio_bisiesto_comun() {					
		assertTrue(verificarBisiesto(1996));
	}
	
	@Test
	public void test_anio_comun() {
		
		assertFalse(verificarBisiesto(2001));
	}
	
	@Test
	public void testAnioComunNoTipico(){		
		assertFalse(verificarBisiesto(1900));
	}
	
	@Test
	public void testAnioBisiestoNotipico()
	{
		assertTrue(verificarBisiesto(2000));
	}

}
