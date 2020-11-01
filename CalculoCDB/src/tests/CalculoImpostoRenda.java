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
}
