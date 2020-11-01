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
		float aliquotaImposto = 0;
		
		if (this.dias <= 180) aliquotaImposto = 22.5f;
		else if (this.dias > 180 && this.dias <= 360) aliquotaImposto = 20f;
		else if (this.dias > 360 && this.dias <= 720 ) aliquotaImposto = 17.5f;
		else aliquotaImposto = 15f;
		
		return (this.getRendBruto() * aliquotaImposto) / 100;		
	}
}
