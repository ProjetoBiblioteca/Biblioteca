package br.ifrn.tads.poo.biblioteca.acervo;

import java.util.ArrayList;

public class ItensEmprestadoArray extends ArrayList<ItemAcervo> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public boolean remove(Object item){
		((ItemAcervo)item).getCodigoItem();
		return super.remove(item);
	}

}
