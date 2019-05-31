package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario {
	
	String nome;
	String telefone;
	Date nascimento;
	String cpf;
	String login;
	String senha;
	String repete;
	Boolean admin; //se == true, é admin
	List<Livro> listaLivros;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
		admin = false;
		this.listaLivros = new ArrayList<Livro>();
	}

	public Usuario(String nome, String telefone, Date nascimento, String cpf, String login, String senha, Boolean admin) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
		this.admin = admin;
		this.listaLivros = new ArrayList<Livro>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public List<Livro> getListaLivros() {
		return listaLivros;
	}

	public void setListaLivros(List<Livro> listaContatos) {
		this.listaLivros = listaContatos;
	}

	public String getRepete() {
		return repete;
	}

	public void setRepete(String repete) {
		this.repete = repete;
	}	
}
