public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	public Pessoa (String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCPF() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public String setEndereco(String newEndereco) {
		endereco = endereco;
	}
}
