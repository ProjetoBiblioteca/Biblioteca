package br.ifrn.tads.poo.biblioteca.acervo;

import java.util.Date;
import java.util.List;

import br.ifrn.tads.poo.biblioteca.usuario.Usuario;

public class Emprestimo {
	private double custo;
	private boolean pago;
	private Date dataAluguel;
	private Date dataDevolucao;
	private Usuario usuario; //Atributo usuario da classe usuario que irá precisar na hora do emprestimo de um item do acervo
	private List<ItemAcervo>itensDeEmprestimoAcervos;
	
	public Emprestimo(Usuario usuario){
		this.usuario = usuario; 
		//Instanciando objeto ,classe IntensEmprestadoArray que herda uma ArrayList de Itens Emprestados
		this.itensDeEmprestimoAcervos = new ItensEmprestadoArray();
	}
	
	//Lista de Emprestimo
	public List<ItemAcervo> getItensDeEmprestimoAcervos() {
		return itensDeEmprestimoAcervos;
	}
	
	
	// Metodos SET E GET  dos atributos da Classe ------------------------
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
	
	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
	
	// Metodos Especificos -------------------------
		public void alugar(){ // PARA ALUGAR UM ITEM DO ACERVO 
		
		}
		public double devolver(){ //PARA DEVOLVER UM ITEM DO ACERVO 
			/*----- implementação ----- */
			return 0;
		}
		public boolean estaPago(){ // VERIFICA SE ESTÁ PAGO 
			/*----- implementação ----- */
			return false;
		}
		public Usuario reservar(Usuario u){ // FAZER UMA RESERVA PARA UM USUÁRIO 
			/*----- implementação ----- */
		return u;
		}
	
	@Override
	public String toString() {
		String toString = "Usuário:"+usuario.toString();
		for(ItemAcervo item : itensDeEmprestimoAcervos){
			toString += "item"+item.getItensAcervo().toString()+"\n";
			System.out.println("----################ ENTROU");
		}
		return toString;
	}
}
