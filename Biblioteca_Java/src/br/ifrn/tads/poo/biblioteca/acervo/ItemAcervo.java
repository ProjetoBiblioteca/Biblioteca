package br.ifrn.tads.poo.biblioteca.acervo;
import java.util.*;

import br.ifrn.tads.poo.biblioteca.usuario.Usuario;

public class ItemAcervo {
	private double custo;
	private Date dataAluguel;
	private Date dataDevolucao;
	private List<String> codigoItem; /* Array de itens */
	private boolean pago;

	
	/*----- Construtor ----- */
	public ItemAcervo() {
		// TODO Auto-generated constructor stub
	}
	
	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public Date getDataAluguel() {
		return dataAluguel;
	}

	public void setDataAluguel(Date dataAluguel) {
		this.dataAluguel = dataAluguel;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public List<String> getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(List<String> codigoItem) {
		this.codigoItem = codigoItem;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	// Metodos Especificos -------------------------
	public void alugar(){
	
	}
	public double devolver(){
		/*----- implementação ----- */
		return 0;
	}
	public boolean estaPago(){
		/*----- implementação ----- */
		return false;
	}
	public Usuario reservar(Usuario u){
		/*----- implementação ----- */
	return u;
	}
	
}
