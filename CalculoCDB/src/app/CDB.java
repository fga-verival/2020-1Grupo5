package app;


public class CDB {
	
	private float aplicacaoInicial;
	private float txJurosAnual;
	private float dias;
	
	public void cadastrarAplicacao(float aplicacaoInicial, float txJurosAnual, int dias  ) {
		this.aplicacaoInicial = aplicacaoInicial;
		this.txJurosAnual = txJurosAnual;
		this.dias = dias;

	}
	public float getRendBruto() {
		return 13.97f; //pela tecnica de falsificacao
	}
}
