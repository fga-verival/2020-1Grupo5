package app;


public class CDB {
	
	private float aplicacaoInicial;
	private float txJurosAnual;
	private float dias;
	private float totalRend;
	
	public void cadastrarAplicacao(float aplicacaoInicial, float txJurosAnual, int dias  ) {
		this.aplicacaoInicial = aplicacaoInicial;
		this.txJurosAnual = txJurosAnual;
		this.dias = dias;
		this.totalRend+=(this.aplicacaoInicial*this.txJurosAnual/100)*this.dias/365;

	}
	
	public float getRendBruto() {
		return this.totalRend;
	}
	
	public float getImpostoRenda() {
		return 3.14f;
	}
}
