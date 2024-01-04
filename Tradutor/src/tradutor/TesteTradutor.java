package tradutor;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteTradutor {

	@Test
	public void tradutorSemPalavras() {
		Tradutor t = new Tradutor();
		assertTrue(t.estaVazio());
	}

	@Test
	public void umaTraducao() {
		Tradutor t = new Tradutor();
		t.adicionarTraducao("bom", "good");
		
		assertFalse(t.estaVazio());
		assertEquals("good", t.traduzir("bom"));
	}

	@Test
	public void duasTraducoes() {
		Tradutor t = new Tradutor();
		t.adicionarTraducao("bom", "good");
		t.adicionarTraducao("mau", "bad");
		
		assertEquals("good", t.traduzir("bom"));
		assertEquals("bad", t.traduzir("mau"));
	}

}
