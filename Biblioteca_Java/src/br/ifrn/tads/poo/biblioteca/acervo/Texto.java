package br.ifrn.tads.poo.biblioteca.acervo;
import java.util.*;

public class Texto extends ItemAcervo{
	private String autor;
	
	public Texto(double custo,Date dataAluguel,Date dataDevolucao,int codigoItem,boolean pago,String autor) {
		super(custo,dataAluguel,dataDevolucao,codigoItem,pago);
		this.autor=autor;		
		}

	public String getAutor() {
		/*----- implementa��o ----- */
		return autor;
	}

	public void setAutor(String autor) {
		/*----- implementa��o ----- */
		this.autor = autor;
	}
	
	
}
