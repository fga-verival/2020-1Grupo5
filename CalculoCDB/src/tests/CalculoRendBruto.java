package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.CDB;

public class CalculoRendBruto {
	private CDB cdb;
	
	@Before
	public void setup() {
		cdb = new CDB();
	}
	
	@Test
	public void testCalcularRendBruto() {
		cdb.cadastrarAplicacao(1000f, 8.5f, 60);
		assertEquals(13.97f, cdb.getRendBruto(), 0.01);
	}
	
	@Test
	public void testCalcularRendBruto2() {
		cdb.cadastrarAplicacao(500f, 8.0f, 120);
		assertEquals(13.15f, cdb.getRendBruto(), 0.01);
	}
	
	@Test
	public void testCalcularRendBruto3() {
		cdb.cadastrarAplicacao(1000f, 8.5f, 60);
		cdb.cadastrarAplicacao(500f, 8.0f, 120);
		assertEquals(27.12f, cdb.getRendBruto(), 0.01);
	}
}
