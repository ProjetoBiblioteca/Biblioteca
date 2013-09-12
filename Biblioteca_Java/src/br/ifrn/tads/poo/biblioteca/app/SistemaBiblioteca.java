package br.ifrn.tads.poo.biblioteca.app;
import java.util.*;

import br.ifrn.tads.poo.biblioteca.usuario.Usuario;
import br.ifrn.tads.poo.biblioteca.Biblioteca;
import br.ifrn.tads.poo.biblioteca.acervo.*;



public class SistemaBiblioteca {
		private static SistemaBiblioteca instance;
		private Biblioteca biblioteca;
		
		public static void main(String[] args) {
			getInstance().Menu();
		}
		public SistemaBiblioteca(){
			
		}
		public static SistemaBiblioteca getInstance() {
			if (instance == null) {
				instance = new SistemaBiblioteca();
				instance.biblioteca = new Biblioteca();
			}
			return instance;
		}
		
		private void listarUsuarios(){
			System.out.println("--- Lista de Usuários ---");
			String ListaDeUsuarios="";
			for(Usuario usuario : biblioteca.getUsuarios()){
				ListaDeUsuarios += usuario.toString()+"\n";
			}
			System.out.println(ListaDeUsuarios);
			Menu();
		}
		private void listarItemAcervo(){
			System.out.println("--- Lista de Itens Acervo ---");
			String ListaDeItensAcervo="";
			for (ItemAcervo itemAcervo : biblioteca.getItems()) {
				ListaDeItensAcervo += itemAcervo.toString()+"\n";
			}
			System.out.println(ListaDeItensAcervo);
		}
		private void cadastrarUsuarios(){
			Scanner op0 = new Scanner(System.in);
			System.out.println("Código Usuário:");
			int codusuario = op0.nextInt();
			Scanner op1 = new Scanner(System.in);
			System.out.println("Nome:");
			String nome = op1.nextLine();
			Scanner op2 = new Scanner(System.in);
			System.out.println("Endereço:");
			String endereco = op2.nextLine();
			Scanner op3 = new Scanner(System.in);
			System.out.println("CPF:");
			String cpf = op3.nextLine();	
			Usuario usuario = new Usuario(codusuario,nome,endereco,cpf);	
			biblioteca.addUsuario(usuario);
			Menu();
		}
		private void cadastrarItemAcervo(){
			System.out.println("   1 - Livro");
			System.out.println("   2 - Apostila");
			System.out.println("   3 - Texto");
			System.out.println("   * Opção : ");
			Scanner opp = new Scanner(System.in);
			int opitem = opp.nextInt();
			switch (opitem) {
			case 1:
				adicionarLivro();
				break;
			case 2:
				adicionarApostila();
				break;
			case 3:
				adicionarTexto();
				break;

			default:
				System.out.println("você deve escolher um dos Itens do Acervo");
				break;
			}
		}
		private void adicionarLivro(){
			System.out.println("______ LIVRO________");
			Scanner li11 = new Scanner(System.in);
			System.out.println("Custo:");
			double custo = li11.nextDouble();
			Scanner li12 = new Scanner(System.in);
			System.out.println("Data Aluguel:");
			String dataAluguel = li12.nextLine();
			Scanner li13 = new Scanner(System.in);
			System.out.println("Data Devolução:");
			String dataDevolucao = li13.nextLine();
			Scanner li14 = new Scanner(System.in);
			System.out.println("Código Item:");
			String codigoItem = li14.nextLine();

			
			Scanner li1 = new Scanner(System.in);
			System.out.println("Titulo:");
			String titulo = li1.nextLine();
			Scanner li2 = new Scanner(System.in);
			System.out.println("Autor:");
			String autor = li2.nextLine();
			Scanner li3 = new Scanner(System.in);
			System.out.println("ISBN:");
			String  isbn = li3.nextLine();
			Scanner li4 = new Scanner(System.in);
			System.out.println("Edicao:");
			Integer  edicao = li4.nextInt();
			Scanner li5 = new Scanner(System.in);
			System.out.println("Quantidade:");
			int  quantidade = li5.nextInt();	

			ItemAcervo itemAcervo = new Livro(custo, dataAluguel, dataDevolucao, codigoItem, true, titulo, autor, isbn, edicao, quantidade);
			biblioteca.addItemAcervo(itemAcervo);
			Menu();
		}
		private void adicionarApostila(){
			System.out.println("______ APOSTILA________");
			Scanner ap11 = new Scanner(System.in);
			System.out.println("Custo:");
			double custo = ap11.nextDouble();
			Scanner ap12 = new Scanner(System.in);
			System.out.println("Data Aluguel:");
			String dataAluguel = ap12.nextLine();
			Scanner ap13 = new Scanner(System.in);
			System.out.println("Data Devolução:");
			String dataDevolucao = ap13.nextLine();
			Scanner ap14 = new Scanner(System.in);
			System.out.println("Código Item:");
			String codigoItem = ap14.nextLine();
			
			Scanner ap1 = new Scanner(System.in);
			System.out.println("Titulo:");
			String titulo = ap1.nextLine();
			Scanner ap2 = new Scanner(System.in);
			System.out.println("Autor:");
			String autor = ap2.nextLine();
			Scanner ap3 = new Scanner(System.in);
			System.out.println("Quantidade:");
			int  quantidade = ap3.nextInt();
			ItemAcervo itemAcervo = new Apostila(custo, dataAluguel, dataDevolucao, codigoItem, true, titulo, autor, quantidade);
			biblioteca.addItemAcervo(itemAcervo);
			Menu();
		}
		private void adicionarTexto(){
			System.out.println("______ TEXTO________");
			Scanner aut1 = new Scanner(System.in);
			System.out.println("Autor:");
			String autor = aut1.nextLine();
			Menu();
		}
		public void  Menu(){
			System.out.println("       Desenvolvido por Suzy e Renno");
			System.out.println("=========== SISTEMA BIBLIOTECA ===========");
			System.out.println("      1 - Cadastrar Novo Usuário");
			System.out.println("      2 - Cadastrar Novo Item Acervo");
			System.out.println("      3 - Empréstimo");
			System.out.println("      4 - Adicionar Item a um Empréstimo");
			System.out.println("      5 - Excluir Usuário");
			System.out.println("      6 - Excluir Item Acervo");
			System.out.println("      7 - Excluir Empréstimo");
			System.out.println("      8 - Excluir um Item Empréstimo");
			System.out.println("      9 - Devolver -TODOS- Itens de um Empréstimo");
			System.out.println("     10 - Devolver -UM- Item do Empréstimo");
			System.out.println("     11 - Pesquisar Item por Título");
			System.out.println("     12 - Listar Usuários");
			System.out.println("     13 - Listar Item Acervo");
			System.out.println("     14 - Listar Empréstimos");
			System.out.println("      0 - SAIR");
			System.out.println("=========================================");
			
			Scanner op = new Scanner(System.in);
			System.out.println("Digite a opção:");
			int opcao = op.nextInt();
			menuOpcao(opcao);

		}
		private  void menuOpcao(int opcao){
			
			switch (opcao) {
			case 1:// Cadastrar um novo usuario
				cadastrarUsuarios();
				break;
			case 2:// Cadastrar um Item do Acervo
				cadastrarItemAcervo();
				break;
			case 3:// Cadastrar um novo Emprestimo
				//cadastrarNovoEmprestimo();
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			case 9:
				
				break;
			case 10:
				
				break;
			case 11:
				
				break;
			case 12://Listar Usuários
				listarUsuarios();
				
				break;
			case 13://Listar Itens Acervo
				listarItemAcervo();
				break;
			case 14:
				
				break;	
			case 15:
				
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Voce deve apertar um numero de 1 a 15.");
				
			}
		}
		

}
