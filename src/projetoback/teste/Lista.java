package projetoback.teste;

import java.util.List;

import projetoback.modelo.Contato;
import projetoback.DAO.ContatoDao;

public class Lista {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
	List<Contato> contatos = dao.getLista();
        contatos.stream().map((contato) -> {
            System.out.println("Nome: " + contato.getNome());
                return contato;
            }).map((contato) -> {
                System.out.println("Email: " + contato.getEmail());
                return contato;
            }).map((contato) -> {
                System.out.println("Endereço: " + contato.getEndereco());
                return contato;
            }).forEachOrdered((contato) -> {
                System.out.println("Data de Nascimento: " +
                        contato.getDataNascimento().getTime() + "\n");
            });
	}
}