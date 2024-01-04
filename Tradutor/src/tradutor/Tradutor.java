package tradutor;

public class Tradutor {

	private String traducao;
	
	public boolean estaVazio() {
		return (traducao==null);
	}

	public void adicionarTraducao(String palavra, String traducao) {
		this.traducao = traducao;
		
	}

	public String traduzir(String palavra) {
		return traducao;
	}

}
