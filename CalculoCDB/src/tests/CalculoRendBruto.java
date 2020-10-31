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
		assertEquals(13.97f, cdb.getRendBruto(), 0);
	}
}
