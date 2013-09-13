package br.ifrn.tads.poo.biblioteca.acervo;
import java.util.*;

import br.ifrn.tads.poo.biblioteca.usuario.Usuario;

public class ItemAcervo {
	private double custo;
	private String dataAluguel;
	private String dataDevolucao;
	private int codigoItem; /* Array de itens */
	private boolean pago;
	
	/*----- Construtor ----- */
	public ItemAcervo() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemAcervo(double custo, String dataAluguel2, String dataDevolucao2,int codigoItem, boolean pago) {
		this.custo=custo;
		this.dataAluguel=dataAluguel2;
		this.codigoItem=codigoItem;
		this.pago=pago;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public String getDataAluguel() {
		return dataAluguel;
	}

	public void setDataAluguel(String dataAluguel) {
		this.dataAluguel = dataAluguel;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}


	public int getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(int codigoItem) {
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
	public String toString() {		
		return this.custo+"-"+this.dataAluguel+"-"+this.dataDevolucao+"-"+this.codigoItem+"-"+this.pago;
	}
	
}
