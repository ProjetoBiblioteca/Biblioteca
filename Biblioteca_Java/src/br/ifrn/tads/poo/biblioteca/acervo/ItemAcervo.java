package br.ifrn.tads.poo.biblioteca.acervo;
import java.util.*;

import br.ifrn.tads.poo.biblioteca.usuario.Usuario;

public class ItemAcervo {
	private double custo;
	private Date dataAluguel;
	private Date dataDevolucao;
	private item codigoItem; /* Array de itens */
	private boolean pago;
	
	/*----- Construtor ----- */
	public ItemAcervo() {
		// TODO Auto-generated constructor stub
	}
	
	public void alugar(){
		/*----- implementa��o ----- */
	}
	public double devolver(){
		/*----- implementa��o ----- */
		return 0;
	}
	public boolean estaPago(){
		/*----- implementa��o ----- */
		return false;
	}
	public Usuario reservar(Usuario u){
		/*----- implementa��o ----- */
	return u;
	}
	
}
