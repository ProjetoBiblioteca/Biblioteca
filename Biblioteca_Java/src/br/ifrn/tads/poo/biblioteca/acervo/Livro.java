package br.ifrn.tads.poo.biblioteca.acervo;
import java.util.*;

/**
 * @author SuzyNerd
 *
 */
public class Livro extends ItemAcervo{
	
	private String titulo;
	private String autor;
	private String ISBN;
	private Integer edicao;
	private int quantidade;
	
	/**
	 * @param custo
	 * @param dataAluguel
	 * @param dataDevolucao
	 * @param codigoItem
	 * @param pago
	 * @param titulo
	 * @param autor
	 * @param ISBN
	 * @param edicao
	 * @param quantidade
	 */
	public Livro(double custo,String dataAluguel,String dataDevolucao,int codigoItem,boolean pago,String titulo,String autor,String ISBN,Integer edicao,int quantidade) {
		super(custo, dataAluguel, dataDevolucao, codigoItem, pago);
		this.titulo=titulo;
		this.autor=autor;
		this.ISBN=ISBN;
		this.edicao=edicao;
		this.quantidade=quantidade;
		
		}


	
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
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
