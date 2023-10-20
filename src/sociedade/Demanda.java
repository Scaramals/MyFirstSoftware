package sociedade;

public class Demanda extends Pessoa{
	
	private int n_protocolo;
	private String tipo;
	private String orgao;
	private String status;
	private String oficio;
	private String observacao;
	private String indicacao;
	
	public Demanda(String nome, String cpf, String telefone, String email, String nacionalidade, String data_nascimento,
			String endereco, String doc_eleitoral, String sexo, String profissao, int n_protocolo, String tipo,
			String orgao, String status, String oficio, String observacao, String indicacao) {
		
		super.setNome(nome);
		super.setCpf(cpf);
		super.setTelefone(telefone);
		super.setEmail(email);
		super.setNacionalidade(nacionalidade);
		super.setData_nascimento(data_nascimento);
		super.setEndereco(endereco);
		super.setDoc_eleitoral(doc_eleitoral);
		super.setSexo(sexo);
		super.setProfissao(profissao);
		setN_protocolo(n_protocolo);
		setTipo(tipo);
		setOrgao(orgao);
		setStatus(status);
		setOficio(oficio);
		setObservacao(observacao);
		setIndicacao(indicacao);
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
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
	public String getIndicacao() {
		return indicacao;
	}
	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}

	@Override
	public String toString() {
		return "Demanda ["+ super.toString() + ", protocolo = " + getN_protocolo() + ", Tipo = " + getTipo() + ", Orgao = "
				+ getOrgao() + ", Status = " + getStatus() + ", Oficio = " + getOficio() + ", Observacao = "
				+ getObservacao() + ", Indicacao = " + getIndicacao() + "]";
	}
	
	
	
	

}
