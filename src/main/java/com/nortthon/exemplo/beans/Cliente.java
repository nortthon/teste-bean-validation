package com.nortthon.exemplo.beans;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import br.com.caelum.stella.bean.validation.CPF;

import com.nortthon.exemplo.beans.constraints.Telefone;



public class Cliente {
	@NotNull
	private String nome;
	@Email
	private String email;
	@Telefone
	private String telefone;
	@CPF
	private String cpf;
	private String rg;
	
	public Cliente(String nome, String email, String telefone, String cpf, String rg) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
}
