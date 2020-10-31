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
		float rend = (this.aplicacaoInicial*this.txJurosAnual/100)*this.dias/365;
		return rend; //pela tecnica de falsificacao
	}
}
