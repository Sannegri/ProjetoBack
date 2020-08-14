package projetoback.teste;

import java.util.Calendar;

import projetoback.modelo.Contato;
import projetoback.DAO.ContatoDao;

public class TestInsere {
       public static void main(String[] args) {

     
            Contato contato = new Contato();
            contato.setNome("Sanne");
            contato.setEmail("contato@sanne.com.br");
            contato.setEndereco("R. Dos Alfeineiros 4 cj87");
            contato.setDataNascimento(Calendar.getInstance());

  
            ContatoDao dao = new ContatoDao();


            dao.adiciona(contato);

        }
      }