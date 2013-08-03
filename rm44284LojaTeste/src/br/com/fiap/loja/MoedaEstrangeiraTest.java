package br.com.fiap.loja;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoedaEstrangeiraTest {

	@Test
	public void testConverterDolarValorPositivo() {
		
		MoedaEstrangeira converter = new MoedaEstrangeira();
		
		int valorReal = converter.converterDolar(5);
		
		assertEquals("Calcular valor com 5 dolares", 10, valorReal);
				
		}


	@Test
	public void testConverterDolarValoZerado() {
		
		MoedaEstrangeira converter = new MoedaEstrangeira();
		
		int valorReal = converter.converterDolar(0);
		
		assertEquals("Calcular valor para valores zerados", 0, valorReal);
				
		}

	@Test
	public void testConverterDolarValoNegativo() {
		
		MoedaEstrangeira converter = new MoedaEstrangeira();
		
		int valorReal = converter.converterDolar(-1);
		
		assertEquals("Calcular valor para valores zerados", -2, valorReal);
				
		}
}
