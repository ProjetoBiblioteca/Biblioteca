package br.ifrn.tads.poo.biblioteca.app;
import java.util.*;
import java.text.DateFormat;  
import java.text.ParseException;
import java.text.SimpleDateFormat;

import br.ifrn.tads.poo.biblioteca.usuario.Usuario;
import br.ifrn.tads.poo.biblioteca.Biblioteca;
import br.ifrn.tads.poo.biblioteca.acervo.*;



public class SistemaBiblioteca {
		private static SistemaBiblioteca instance;
		private Biblioteca biblioteca;
	
		
		public static void main(String[] args) throws ParseException {
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
		
		private ItemAcervo buscarUmItemAcervo(){ //BUSCAR ITEM DO ACERVO PELO CODIGO DO ITEM CADASTRADO  ---------
			Scanner op3 = new Scanner(System.in);
			System.out.println("Código do Item Acervo:");
			int codigoItem = op3.nextInt();
			return biblioteca.getItensAcervo(codigoItem);
		}
		
		private void excluirUsuario() throws ParseException{ //EXCLUIR USUARIO -----------
			Scanner op3 = new Scanner(System.in);
			System.out.println("CPF do Usuário:");
			String cpf = op3.nextLine();
			
			Usuario usuario = new Usuario('*',"", "", cpf);
			int index = biblioteca.getUsuarios().lastIndexOf(usuario);
			/*lastIndexOf : Pesquisas para a última ocorrência de um caractere ou substring.*/
			if (index == -1) {	
				System.out.println("Usuário não existe ");
			}else{
				biblioteca.removeUsuario(biblioteca.getUsuarios().get(index));
				System.out.println("Usuário Removido com Sucesso");
			}
			Menu();
		}	

		private void excluirItemAcervo() throws ParseException{ // EXCLUIR ITEM DO ACERVO  ------
			ItemAcervo itemAcervo = buscarUmItemAcervo(); // FAZ A BUSCA PRIMEIRO 
			if (itemAcervo == null) {
				System.out.println("Não existe esse Item");
			}else{
				biblioteca.removeItemAcervo(itemAcervo);
				System.out.println("Item Removido com Sucesso");
			}
			Menu();
		}
		
		private void listarUsuarios() throws ParseException{ // LISTAR USUARIOS CADASTRADOS ----- 
			System.out.println("--- Lista de Usuários ---");
			String ListaDeUsuarios="";
			for(Usuario usuario : biblioteca.getUsuarios()){
				ListaDeUsuarios += usuario.toString()+"\n";
			}
			System.out.println(ListaDeUsuarios);
			Menu();
		}
		private void listarItemAcervo() throws ParseException{ //LISTAR ITENS DO ACERVO ----
			System.out.println("--- Lista de Itens Acervo ---");
			String ListaDeItensAcervo="";
			for (ItemAcervo itemAcervo : biblioteca.getItems()) {
				ListaDeItensAcervo +="Código Item:"+itemAcervo.getCodigoItem()+itemAcervo.toString()+"\n";
			}

			System.out.println(ListaDeItensAcervo);
			Menu();
		}
		public void listarEmprestimos() throws ParseException{
			System.out.println("--- Lista de Emprestimos ---");
			String listaDeEmprestimos="";
			for (Emprestimo emprestimo : biblioteca.getEmprestimo()) {
				listaDeEmprestimos+=emprestimo.toString()+"\n";
			}
			System.out.println(listaDeEmprestimos);
			Menu();
		}
		private void cadastrarUsuarios() throws ParseException{ // CADASTRAR USUÁRIO -----
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
		private void cadastrarItemAcervo() throws ParseException{ //CADASTRAR ITEM DO ACERVO ------
			System.out.println("   1 - Livro");
			System.out.println("   2 - Apostila");
			System.out.println("   3 - Texto");
			System.out.println("   * Opção : ");
			Scanner opp = new Scanner(System.in);
			int opitem = opp.nextInt(); // ESCOLHE O TIPO DO ITEM -----
			switch (opitem) {
			case 1:
				adicionarLivro(); // ADICIONAR  UM LIVRO -----
				break;
			case 2:
				adicionarApostila(); //ADICIONAR UMA APOSTILA ----
				break;
			case 3:
				adicionarTexto(); //ADICIONAR UM TEXTO ----
				break;

			default:
				System.out.println("você deve escolher um dos Itens do Acervo");
				break;
			}
		}
		private void cadastrarNovoEmprestimo() throws ParseException{ // CADASTRAR EMPRESTIMO --------
			//------Ler o CPF do Usuário
			Scanner opEmp = new Scanner(System.in);
			System.out.println("CPF do Usuário:");
			String cpf = opEmp.nextLine();
			
			//----- Procura o usuário pelo CPF  digitado
			Usuario usuario = new Usuario('*',"", "", cpf);
			int index = biblioteca.getUsuarios().lastIndexOf(usuario);
			
			
			//DateFormat dataDevolucao = DateFormat.getInstance();
			//Instanciar para ser  8 dias que será o prazo para devolver
			
			
			Emprestimo emprestimo = new Emprestimo(biblioteca.getUsuarios().get(index));
		    buscarUmItemAcervo();
			biblioteca.getEmprestimo().add(emprestimo);
			Menu();
			
		}
		private void adicionarLivro() throws ParseException{ // ADICIONAR LIVRO --------
			System.out.println("______ LIVRO________");

			Scanner li14 = new Scanner(System.in);
			System.out.println("Código Item:");
			int codigoItem = li14.nextInt();

			
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

			ItemAcervo itemAcervo = new Livro( codigoItem, titulo, autor, isbn, edicao, quantidade);
			
			biblioteca.addItemAcervo(itemAcervo);
			Menu();
		}
		private void adicionarApostila() throws ParseException{ //  ADICIONAR APOSTILA -------
			System.out.println("______ APOSTILA________");
			
			Scanner ap14 = new Scanner(System.in);
			System.out.println("Código Item:");
			int codigoItem = ap14.nextInt();
			
			Scanner ap1 = new Scanner(System.in);
			System.out.println("Titulo:");
			String titulo = ap1.nextLine();
			Scanner ap2 = new Scanner(System.in);
			System.out.println("Autor:");
			String autor = ap2.nextLine();
			Scanner ap3 = new Scanner(System.in);
			System.out.println("Quantidade:");
			int  quantidade = ap3.nextInt();
			ItemAcervo itemAcervo = new Apostila(codigoItem, titulo, autor, quantidade);
			biblioteca.addItemAcervo(itemAcervo);
			Menu();
		}
		private void adicionarTexto() throws ParseException{ // ADICIONAR TEXTO  --------------
			System.out.println("______ TEXTO________");
			Scanner aut1 = new Scanner(System.in);
			System.out.println("Autor:");
			String autor = aut1.nextLine();
			Menu();
		}
		public void  Menu() throws ParseException{ // Menu de opção possiveis do meu sistema de controle de biblioteca --------------
			System.out.println("__________________________________________");
			System.out.println("       Desenvolvido por Suzy e Renno Garcia");
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
			System.out.println("__________________________________________");
			
			Scanner op = new Scanner(System.in);
			System.out.println("Digite a opção:");
			int opcao = op.nextInt();
			menuOpcao(opcao); // chama o menu opção levando como parametro a opção digitada --------------

		}
		private  void menuOpcao(int opcao) throws ParseException{ // Chama um método de uma determinada funcão do Menu --------------
			
			switch (opcao) {
			case 1:// Cadastrar um novo usuario ------
				cadastrarUsuarios();
				break;
			case 2:// Cadastrar um Item do Acervo ------
				cadastrarItemAcervo();
				break;
			case 3:// Cadastrar um novo Emprestimo ----------
				cadastrarNovoEmprestimo();
				break;
			case 4:
				
				break;
			case 5: // Excluir Usuário ----------
				excluirUsuario();
				break;
			case 6: // Excluir um Item do acervo pelo código do Item ---------
				excluirItemAcervo();
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
			case 12://Listar Usuários -----------
				listarUsuarios();
				
				break;
			case 13://Listar Itens Acervo -----------
				listarItemAcervo();
				break;
			case 14:
				listarEmprestimos();
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
