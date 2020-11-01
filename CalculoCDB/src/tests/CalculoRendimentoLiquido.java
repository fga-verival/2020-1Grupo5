package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import app.CDB;

public class CalculoRendimentoLiquido {
	private CDB cdb;
	
	@Before
	public void setup() {
		cdb = new CDB();
	}
	
	@Test
	public void testRendimentoLiquido() {
		cdb.cadastrarAplicacao(1000f, 8.5f, 60);
		assertEquals(1.08f, cdb.getRendimentoLiquido(), 0.01);
	}
}