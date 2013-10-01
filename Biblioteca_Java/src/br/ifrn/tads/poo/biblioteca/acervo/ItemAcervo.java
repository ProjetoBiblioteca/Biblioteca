package br.ifrn.tads.poo.biblioteca.acervo;

import br.ifrn.tads.poo.biblioteca.Biblioteca;


public class ItemAcervo  {
	private int codigoItem; 
	private Livro livro;
	private Biblioteca bilio;


	/*----- Construtor ----- */
	
	public ItemAcervo() {
		
	}	
	
	public ItemAcervo(int codigoItem) {
		this.codigoItem=codigoItem;

	}
	
	public int getCodigoItem() { // Retorna o Código do item
		return codigoItem;
	}

	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}

	public Biblioteca getItensAcervo(){
		return bilio;
	}
	
	public String toString() {
		return "Código Item:"+codigoItem+""+livro.toString();
	}

	
}
