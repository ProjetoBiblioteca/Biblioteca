package br.ifrn.tads.poo.biblioteca.ado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ifrn.tads.poo.biblioteca.usuario.Usuario;
import br.ifrn.tads.poo.biblioteca.ado.bancoDao;


public class usuarioDao {

	public Usuario cadastrar(Usuario usuarioDao){
		try{
			bancoDao.getStatement().executeUpdate("INSERT INTO usuarioAdo (codigoUsuario,nome,endereco,cpf) VALUES" +
					" ( '" + usuarioDao.getCodusuario()+ "' , " +
					" '" + usuarioDao.getNome() + "', " +
					" '" + usuarioDao.getEndereco() + "', " +
					" " + usuarioDao.getCpf()+ ") ");
		
		return usuarioDao;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
	public List<Usuario> gerAll(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		try{
			ResultSet rs = bancoDao.getStatement().executeQuery("SELECT * FROM usuarioAdo");
			while(rs.next()){

				Usuario c = new Usuario();
				c.setCodusuario(rs.getInt("codigoUsuario"));
				c.setNome(rs.getString("nome"));
				c.setEndereco(rs.getString("endereco"));
				c.setCpf(rs.getString("cpf"));

				usuarios.add(c);

			}

			bancoDao.close();
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	System.out.println(usuarios);
		return usuarios;
	}
}
