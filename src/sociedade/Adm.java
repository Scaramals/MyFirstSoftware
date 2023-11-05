package sociedade;

import java.util.List;
import java.util.ArrayList;

public class Adm extends Pessoa{
	
	
	private int id;
	private String senha;
	private List<Demanda> demandas = new ArrayList<>();
	private List<Pessoa> pessoas = new ArrayList<>();
	
	public Adm() {
		
	}
	
	public Adm(String nome, int id) {
		super.setNome(nome);
		setId(id);
		
	}
	public Adm(String nome, String cpf, String telefone, String email, String nacionalidade, String data_nascimento,
			String endereco, String doc_eleitoral, String sexo, String profissao, Adm acessor, int id, String senha) {
		
		super(nome, cpf,telefone,email,nacionalidade,data_nascimento,endereco, doc_eleitoral, sexo,profissao,acessor);
		setId(id);
		setSenha(senha);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Demanda> getDemandas() {
		return demandas;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public void addPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	public void removePessoa(Pessoa pessoa) {
		pessoas.remove(pessoa);
	}
	
	public void addDemanda(Demanda demanda) {
		demandas.add(demanda);
	}
	
	public void removeDemanda(Demanda demanda) {
		demandas.remove(demanda);
	}
	

	@Override
	public String toString() {
		
		return "Adm ["+ super.toString() + ", id=" + getId() + ", senha=" + getSenha() + "]";
	}
	

}
