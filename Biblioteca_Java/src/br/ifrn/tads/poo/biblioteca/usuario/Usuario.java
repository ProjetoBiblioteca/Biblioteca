package br.ifrn.tads.poo.biblioteca.usuario;
import br.ifrn.tads.poo.biblioteca.acervo.ItemAcervo;

public class Usuario {
	private int codusuario;
	private String nome;
	private String endereco;
	private String cpf;
	
	
	/*----- Construtor ----- */
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public Usuario(int codUsuario,String nome,String endereco,String cpf) {
		this.codusuario=codUsuario;
		this.nome=nome;
		this.endereco=endereco;
		this.cpf=cpf;
	}
	public void pagar(){
	/*----- implementação ----- */
	}
	public ItemAcervo escolherItemAcervo(){
		/*----- implementação ----- */
		return null;	
	}
	
	/*----- Métodos SET  e GET ----- */
	public int getCodusuario() {
		return codusuario;
	}
	public void setCodusuario(int codusuario) {
		this.codusuario = codusuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {		
		return this.codusuario+"-"+this.nome+"-"+this.endereco+"-"+this.cpf;
	}
	
}
