/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import rm_desbravador.utilitarios.Conexao;
import rm_desbravador.utilitarios.PropertiesLoaderImpl;

/**
 *
 * @author marcos
 */
public class GerarClienteDao {

    public ResultSet listaDeClientes() {
        Connection con;
        Conexao abrirCon = new Conexao();
        String sql = "select * from cadempresa limit 1";
        con = abrirCon.getConexao(
                PropertiesLoaderImpl.getValor("servidor"),
                PropertiesLoaderImpl.getValor("porta"),
                PropertiesLoaderImpl.getValor("banco"),
                PropertiesLoaderImpl.getValor("usuario"),
                PropertiesLoaderImpl.getValor("senha"));
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
}
