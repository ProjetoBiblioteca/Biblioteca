package br.ifrn.tads.poo.biblioteca.acervo;
import java.util.*;

public class Texto extends ItemAcervo{
	private String autor;
	
	public Texto(int codigoItem,String autor) {
		super(codigoItem);
		this.autor=autor;		
		}

	public String getAutor() {
		/*----- implementação ----- */
		return autor;
	}

	public void setAutor(String autor) {
		/*----- implementação ----- */
		this.autor = autor;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return "  Autor :"+this.autor;
	}
	
}
