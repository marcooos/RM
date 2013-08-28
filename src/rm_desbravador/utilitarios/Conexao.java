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
    Connection connection;

    public Conexao() {
        mensagemRet = "";
    }

    public String getMensagemRet() {
        return mensagemRet;
    }

    public Connection getConexao(String servidor, String porta, String banco,
            String usuario, String senha, boolean tipoBanco) {

        mensagemRet = "-------- PostgreSQL "
                + "JDBC teste de conexão ------------";

        try {
            if (tipoBanco) {
                //SQLServer
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            } else {
                 //PostGreSQL
                Class.forName("org.postgresql.Driver");
            }
             
        } catch (ClassNotFoundException e) {
            mensagemRet = "";
            mensagemRet = "Driver JDBC não localizado "
                    + "Inclua no seu path library!" + e;
            return null;

        }

        mensagemRet = "";
        mensagemRet = "PostgreSQL JDBC Driver Registrado!";

        connection = null;

        try {
            if (tipoBanco) {
                //SQLServer
                connection = DriverManager.getConnection(
                    "jdbc:sqlserver://"
                    + servidor + ":" + porta + ";" +
                    "databaseName="+banco + ";"+
                    "user="+usuario+";" +
                    "password="+senha+";");
            
            } else {
                //PostgreSQL
             connection = DriverManager.getConnection(
                    "jdbc:postgresql://"
                    + servidor + ":" + porta + "/" + banco + "", usuario, senha);   
            }            

        } catch (SQLException e) {

            mensagemRet = "";
            mensagemRet = "Conexão Falhou" + e;

            return null;

        }

        if (connection != null) {
            mensagemRet = "";
            mensagemRet = "Conectado a base de dados!";
            return connection;
        } else {
            mensagemRet = "";
            mensagemRet = "Falha na conexão!";
            return null;
        }
    }
}
