package sociedade;

import java.util.Date;

import entities.enums.StatusDemanda;

public class Demanda {
	
	private Pessoa pessoa;//como a demanda tem apenas uma pessoa
	private int n_protocolo;
	private String tipo;
	private String orgao;
	private Date dataDemanda;
	private StatusDemanda status;
	private String oficio;
	private String observacao;
	private Adm indicacao;
	
	public Demanda(Pessoa pessoa, int n_protocolo, String tipo,
			String orgao, StatusDemanda status, String oficio, String observacao, Adm indicacao, Date dataDemanda) {
		
		setPessoa(pessoa);
		setN_protocolo(n_protocolo);
		setTipo(tipo);
		setOrgao(orgao);
		setStatus(status);
		setOficio(oficio);
		setObservacao(observacao);
		setIndicacao(indicacao);
		setDataDemanda(dataDemanda);
		
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public int getN_protocolo() {
		return n_protocolo;
	}
	public void setN_protocolo(int n_protocolo) {
		this.n_protocolo = n_protocolo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getOrgao() {
		return orgao;
	}
	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}
	public StatusDemanda getStatus() {
		return status;
	}
	public void setStatus(StatusDemanda status) {
		this.status = status;
	}
	public String getOficio() {
		return oficio;
	}
	public void setOficio(String oficio) {
		this.oficio = oficio;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Adm getIndicacao() {
		return indicacao;
	}
	public void setIndicacao(Adm indicacao) {
		this.indicacao = indicacao;
	}
	public Date getDataDemanda() {
		return dataDemanda;
	}
	public void setDataDemanda(Date dataDemanda) {
		this.dataDemanda = dataDemanda;
	}


	@Override
	public String toString() {
		return "Demanda ["+ "Pessoa: " + getPessoa() + ", protocolo = " + getN_protocolo() + ", Tipo = " + getTipo() + ", Orgao = "
				+ getOrgao() + ", Status = " + getStatus() + ", Oficio = " + getOficio() + ", Observacao = "
				+ getObservacao() + ", Indicacao = " + getIndicacao() + " Data: " + getDataDemanda() + "]";
	}
	
	
	
	

}
