package projetoback.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import projetoback.ConnectionFactory;
import projetoback.modelo.Contato;

public class ContatoDao {

    private final Connection connection;

    public ContatoDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Contato contato) {
        String sql = "insert into contatos"
                + "(nome,email,endereco,dataNascimento)"
                + "values(?,?,?,?)";

        try {
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1, contato.getNome());
                stmt.setString(2, contato.getEmail());
                stmt.setString(3, contato.getEndereco());
                stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
                
                stmt.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public List<Contato> getLista() {
        try {
            List<Contato> contatos = new ArrayList<>();
            try (PreparedStatement stmt = this.connection.
                    prepareStatement("select * from contatos"); ResultSet rs = stmt.executeQuery()) {
                
                while (rs.next()) {
                    Contato contato = new Contato();
                    contato.setId(rs.getLong("id"));
                    contato.setNome(rs.getString("nome"));
                    contato.setEmail(rs.getString("email"));
                    contato.setEndereco(rs.getString("endereco"));
                    
                    Calendar data = Calendar.getInstance();
                    data.setTime(rs.getDate("dataNascimento"));
                    contato.setDataNascimento(data);
                    
                    contatos.add(contato);
                }
            }
            return contatos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
