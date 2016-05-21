package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
       testExcluir();
	}
	public static void testExcluir() {
		// Alterando o Usu�rio
		Usuario usu = new Usuario();
		usu.setId(4);;
		
		// O c�digo a baixo exclui o usu�rio no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);

		System.out.println("Excluido com sucesso!!");

	}
	
	public static void testAlterar() {
		// Alterando o Usu�rio
		Usuario usu = new Usuario();
		usu.setId(2);
		usu.setNome("Maria I. Oliveira");
		usu.setLogin("MIoliver");
		usu.setSenha("1860");
		// O c�digo a baixo altera informa��es do usu�rio no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);

		System.out.println("Alterado com sucesso!!");

	}

	public static void testCadastrar() {
		// Criando o Usu�rio
		Usuario usu = new Usuario();
		usu.setNome("Daniel");
		usu.setLogin("DC");
		usu.setSenha("3927");
		// O c�digo a baixo cadastra o usu�rio no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);

		System.out.println("Cdastrado com sucesso!!");

	}
}
