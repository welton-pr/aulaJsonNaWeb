package model;

import java.sql.Timestamp;

public class Cliente {

	private int codigo;
	private String nome;
	private Timestamp nascimento;
	private String email;
	private Dependentes dependentes;
	
	
	//Getters e setters
	
	
	public int getCodigo() {
		return codigo;
	}
	public Dependentes getDependentes() {
		return dependentes;
	}
	public void setDependentes(Dependentes dependentes) {
		this.dependentes = dependentes;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Timestamp getNascimento() {
		return nascimento;
	}
	public void setNascimento(Timestamp nascimento) {
		this.nascimento = nascimento;
	}
}
