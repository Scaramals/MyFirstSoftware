package sociedade;

import java.util.ArrayList;
import java.util.List;

//perguntar sobre como colocar para os atributos não serem nulos, perguntar sobre a data de nascimento e data da demanda e sobre a necessidade de um metodo cadastra
public class Pessoa {
	
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String nacionalidade;
	private String data_nascimento;
	private String endereco;
	private String doc_eleitoral;
	private String sexo;
	private String profissao;
	private List<Demanda> demanda = new ArrayList<>();
	private Adm indicacao;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cpf, String telefone, String email, String nacionalidade, String data_nascimento,
			String endereco, String doc_eleitoral, String sexo, String profissao, Adm indicacao) {
		setNome(nome);
		setCpf(cpf);
		setTelefone(telefone);
		setEmail(email);
		setNacionalidade(nacionalidade);
		setData_nascimento(data_nascimento);
		setEndereco(endereco);
		setDoc_eleitoral(doc_eleitoral);
		setSexo(sexo);
		setProfissao(profissao);
		setIndicacao(indicacao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDoc_eleitoral() {
		return doc_eleitoral;
	}

	public void setDoc_eleitoral(String doc_eleitoral) {
		this.doc_eleitoral = doc_eleitoral;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public List<Demanda> getDemanda(){
		return demanda;
	}
	public void setDemanda(List<Demanda> demanda) {
		this.demanda = demanda;
	}
	

	public Adm getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(Adm indicacao) {
		this.indicacao = indicacao;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + getNome() + ", cpf=" + getCpf() + ", telefone=" + getTelefone() + ", email=" + getEmail()
				+ ", nacionalidade=" + getNacionalidade() + ", data_nascimento=" + getData_nascimento() + ", endereco=" + getEndereco()
				+ ", doc_eleitoral=" + getDoc_eleitoral() + ", sexo=" + getSexo() + ", profissao=" + getProfissao() + "Indicado: " + getIndicacao()+ ", Demandas: " + getDemanda() + "]";
	}
	
	
	
	
}
