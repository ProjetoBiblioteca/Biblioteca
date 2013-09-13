package br.ifrn.tads.poo.biblioteca;
import br.ifrn.tads.poo.biblioteca.usuario.Usuario;
import br.ifrn.tads.poo.biblioteca.acervo.ItemAcervo;

import java.util.*;

public class Biblioteca {
	private String nomeBiblioteca;
	private List<Usuario>usuarios;
	private List<ItemAcervo>items;
	
	/* METODOS GET para Arrays */
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public List<ItemAcervo> getItems() {
		return items;
	}
	public ItemAcervo getItensAcervo(int codItem){ // Metodo get para receber um codigo do item e retornar o intem daquele codigo
		ItemAcervo variItemAcervo =null;
		for (ItemAcervo CodInteracao : items) {
			if (CodInteracao.getCodigoItem()==codItem) {
				variItemAcervo=CodInteracao;
				break;
			}
		}
		return variItemAcervo;
	}
	/*----- Construtor ----- */
	public Biblioteca() {
		this.usuarios = new ArrayList<Usuario>();
		this.items = new ArrayList<ItemAcervo>();

	}
	/* Adicionar um Usuario no ArrayList */
	public  void addUsuario(Usuario usuario){
		usuarios.add(usuario);
		System.out.println("Adicionado com Sucesso!");
	}
	public void addItemAcervo(ItemAcervo itemAcervo){
		items.add(itemAcervo);
		System.out.println("Adicionado com Sucesso!");
	}
	public void removeUsuario(Usuario usuario){
		usuarios.remove(usuario);
	}
	public void removeItemAcervo(ItemAcervo itemAcervo){
		items.remove(itemAcervo);
	}
	/* GET  e  SET NomeBiblioteca */
	public String getNomeBiblioteca() {
		return nomeBiblioteca;
	}

	public void setNomeBiblioteca(String nomeBiblioteca) {
		this.nomeBiblioteca = nomeBiblioteca;
	}

	/*Metodo Calcular Valor Mutas */
	public double calcularValorMutas(Date dia){
		/*----- implementação ----- */
		return 0;
	}
}
