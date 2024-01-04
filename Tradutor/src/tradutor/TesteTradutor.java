package tradutor;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteTradutor {

	@Test
	public void tradutorSemPalavras() {
		Tradutor t = new Tradutor();
		assertTrue(t.estaVazio());
	}

}
