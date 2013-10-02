package br.ifrn.tads.poo.biblioteca.acervo;
import java.util.*;

public class Apostila extends ItemAcervo {
	
	private String titulo;
	private String autor;
	private int quantidade;
	
	
	public Apostila(int codItem,String titulo,String autor,int quantidade) {
	super(codItem);
	this.titulo=titulo;
	this.autor=autor;
	this.quantidade=quantidade;
	
	}
	
	/*----- Métodos SET  e GET ----- */
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
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return " Titulo :"+this.titulo+"  Autor :"+this.autor+"   Quantidade :"+this.quantidade;
	}
}
