package br.ifrn.tads.poo.biblioteca.usuario;
import java.util.*;

import br.ifrn.tads.poo.biblioteca.acervo.ItemAcervo;

public class Usuario {
	private int codusuario;
	private String nome;
	private String endereco;
	private String cpf;
	
	
	/*----- Construtor ----- */
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public void pagar(){
	/*----- implementa��o ----- */
	}
	public ItemAcervo escolherItemAcervo(){
		/*----- implementa��o ----- */
		return null;	
	}
	
	/*----- M�todos SET  e GET ----- */
	public int getCodusuario() {
		return codusuario;
	}
	public void setCodusuario(int codusuario) {
		this.codusuario = codusuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
