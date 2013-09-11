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
			System.out.println("Lista de Usu�rios");
			String ListaDeUsuarios="";
			for(Usuario usuario : biblioteca.getUsuarios()){
				ListaDeUsuarios += usuario.toString()+"\n";
			}
			System.out.println(ListaDeUsuarios);
		}
		public void  Menu(){
			System.out.println("       Desenvolvido por Suzy e Renno");
			System.out.println("=========== SISTEMA BIBLIOTECA ===========");
			System.out.println("      1 - Cadastrar Novo Usu�rio");
			System.out.println("      2 - Cadastrar Novo Item Acervo");
			System.out.println("      3 - Empr�stimo");
			System.out.println("      4 - Adicionar Item a um Empr�stimo");
			System.out.println("      5 - Excluir Usu�rio");
			System.out.println("      6 - Excluir Item Acervo");
			System.out.println("      7 - Excluir Empr�stimo");
			System.out.println("      8 - Excluir um Item Empr�stimo");
			System.out.println("      9 - Devolver -TODOS- Itens de um Empr�stimo");
			System.out.println("     10 - Devolver -UM- Item do Empr�stimo");
			System.out.println("     11 - Pesquisar Item por T�tulo");
			System.out.println("     12 - Listar Usu�rios");
			System.out.println("     13 - Listar Item Acervo");
			System.out.println("     14 - Listar Empr�stimos");
			System.out.println("      0 - SAIR");
			System.out.println("=========================================");
			
			Scanner op = new Scanner(System.in);
			System.out.println("Digite a op��o:");
			int opcao = op.nextInt();
			menuOpcao(opcao);

		}
		private  void menuOpcao(int opcao){
			
			switch (opcao) {
			case 1:// Cadastrar um novo usuario
				Scanner op0 = new Scanner(System.in);
				System.out.println("C�digo Usu�rio:");
				int codusuario = op0.nextInt();
				Scanner op1 = new Scanner(System.in);
				System.out.println("Nome:");
				String nome = op1.nextLine();
				Scanner op2 = new Scanner(System.in);
				System.out.println("Endere�o:");
				String endereco = op2.nextLine();
				Scanner op3 = new Scanner(System.in);
				System.out.println("CPF:");
				String cpf = op3.nextLine();	
				Usuario usuario = new Usuario(codusuario,nome,endereco,cpf);	
				biblioteca.addUsuario(usuario);
				Menu();
				break;
			case 2:// Cadastrar um Item do Acervo
				//cadastrarNovaPublicacao();
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
			case 12://Listar Usu�rios
				listarUsuarios();
				
				break;
			case 13:
				
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
