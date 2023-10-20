package sociedade;

public class Adm extends Pessoa{
	
	
	private int id;
	private String senha;
	
	public Adm() {
		
	}
	
	public Adm(String nome, String cpf, String telefone, String email, String nacionalidade, String data_nascimento,
			String endereco, String doc_eleitoral, String sexo, String profissao, int id, String senha) {
		
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

	@Override
	public String toString() {
		
		return "Adm ["+ super.toString() + ", id=" + getId() + ", senha=" + getSenha() + "]";
	}
	

}
