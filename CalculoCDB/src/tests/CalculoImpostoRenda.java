package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import app.CDB;

public class CalculoImpostoRenda {
	private CDB cdb;
	
	@Before
	public void setup() {
		cdb = new CDB();
	}
	
	@Test
	public void testCalcularImpostoRenda() {
		cdb.cadastrarAplicacao(1000f, 8.5f, 60);
		assertEquals(3.14f, cdb.getImpostoRenda(), 0.01);		
	}
	
	@Test
	public void testCalcularImpostoRenda2() {
		cdb.cadastrarAplicacao(500f, 8.0f, 120);
		assertEquals(2.96f, cdb.getImpostoRenda(), 0.01);
	}
	
	@Test
	public void testCalcularImpostoRenda3() {
		cdb.cadastrarAplicacao(3000f, 9.0f, 240);
		assertEquals(35.51f, cdb.getImpostoRenda(), 0.01);
	}
}
