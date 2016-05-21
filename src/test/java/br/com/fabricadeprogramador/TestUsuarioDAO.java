package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
       testExcluir();
	}
	public static void testExcluir() {
		// Alterando o Usuário
		Usuario usu = new Usuario();
		usu.setId(4);;
		
		// O código a baixo exclui o usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);

		System.out.println("Excluido com sucesso!!");

	}
	
	public static void testAlterar() {
		// Alterando o Usuário
		Usuario usu = new Usuario();
		usu.setId(2);
		usu.setNome("Maria I. Oliveira");
		usu.setLogin("MIoliver");
		usu.setSenha("1860");
		// O código a baixo altera informações do usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);

		System.out.println("Alterado com sucesso!!");

	}

	public static void testCadastrar() {
		// Criando o Usuário
		Usuario usu = new Usuario();
		usu.setNome("Daniel");
		usu.setLogin("DC");
		usu.setSenha("3927");
		// O código a baixo cadastra o usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);

		System.out.println("Cdastrado com sucesso!!");

	}
}
