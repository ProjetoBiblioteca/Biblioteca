package br.ifrn.tads.poo.biblioteca.acervo;
import java.text.DateFormat;
import java.util.*;

import br.ifrn.tads.poo.biblioteca.usuario.Usuario;

public class ItemAcervo  {
	private int codigoItem; 
	private Livro livro;
	private Emprestimo itensEmprestimo;


	/*----- Construtor ----- */
	
	public ItemAcervo() {
		
	}	
	
	public ItemAcervo(int codigoItem) {
		this.codigoItem=codigoItem;

	}
	
	public int getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}

	
	public String toString() {
		return "Código Item:"+codigoItem+""+livro.toString();
	}

	public Emprestimo getItensAcervo(){
		return itensEmprestimo;
	}
	
}
