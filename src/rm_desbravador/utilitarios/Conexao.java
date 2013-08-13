/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.utilitarios;

/**
 *
 * @author marcos
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexao {

    String mensagemRet;

    public Conexao() {
        mensagemRet = "";
    }

    public String getMensagemRet() {
        return mensagemRet;
    }

    public boolean getConexao(String servidor, String porta, String banco, String usuario, String senha) {

        mensagemRet = "-------- PostgreSQL "
                + "JDBC teste de conexão ------------";

        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {
            mensagemRet = "";
            mensagemRet = "Driver JDBC não localizado "
                    + "Inclua no seu path library!" + e;
            return false;

        }

        mensagemRet = "";
        mensagemRet = "PostgreSQL JDBC Driver Registrado!";

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://"
                    + servidor + ":" + porta + "/" + banco + "", usuario, senha);

        } catch (SQLException e) {

            mensagemRet = "";
            mensagemRet = "Conexão Falhou" + e;

            return false;

        }

        if (connection != null) {
            mensagemRet = "";
            mensagemRet = "Conectado a base de dados!";
            return true;
        } else {
            mensagemRet = "";
            mensagemRet = "Falha na conexão!";
            return false;
        }
    }
}
