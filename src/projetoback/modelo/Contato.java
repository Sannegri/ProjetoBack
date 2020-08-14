package projetoback.modelo;

import java.util.Calendar;

public class Contato {
	
	private Long id;
	private String login;
        private String nome;
        private String lastName;
	private String email;
	private String endereco;
	private Calendar dataNascimento;
	
	
        public String getlogin() {
	return this.login;
	}
	public void setLogin(String novo) {
		this.login = novo;
	}
        public String getNome() {
	return this.nome;
	}
	public void setNome(String novo) {
		this.nome = novo;
	}
	public String getlastName() {
		return this.lastName;
	}
	public void setlastName(String novo) {
		this.lastName = novo;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String novo) {
		this.email = novo;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String novo) {
		this.endereco = novo;
	}
	public Long getId() {
		return this.id;
	}
	public void setId(Long novo) {
		this.id = novo;
	}
	public Calendar getDataNascimento() {
		return this.dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}	

}