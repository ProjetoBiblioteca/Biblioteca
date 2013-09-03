package br.ifrn.tads.poo.biblioteca.acervo;
import java.util.*;

public class Livro extends ItemAcervo{
	
	private String titulo;
	private String autor;
	private String ISBN;
	private Integer edicao;
	private int quantidade;
	
	/*----- Método SET e  GET ----- */
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Integer getEdicao() {
		return edicao;
	}
	public void setEdicao(Integer edicao) {
		this.edicao = edicao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
