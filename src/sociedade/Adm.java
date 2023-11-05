package sociedade;

import java.util.List;
import java.util.ArrayList;

public class Adm extends Pessoa{
	
	
	private int id;
	private String senha;
	private List<Demanda> demanda = new ArrayList<>();
	private List<Pessoa> pessoa = new ArrayList<>();
	
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

	public List<Demanda> getDemanda() {
		return demanda;
	}

	public void setDemanda(List<Demanda> demanda) {
		this.demanda = demanda;
	}

	public List<Pessoa> getPessoa() {
		return pessoa;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoa = pessoa;
	}
	

	@Override
	public String toString() {
		
		return "Adm ["+ super.toString() + ", id=" + getId() + ", senha=" + getSenha() + "]";
	}
	

}
