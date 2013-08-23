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
        String sql = "select codempresa,nomeempresa,razaosocial,cgc,inscest,cidade,"
                + "complementonr,email,complemento,estado,cep,telefone, cobcidade,"
                + "cobestado,cobcep, cobfone, nroendcorresp,cidadecorresp,"
                + "estadocorresp,cepcorresp,fax,dtfunda,inscmunicipal,tipoemp,pais,"
                + "codibge, suframa,cei,bairro, endereco, cobendereco, enderecocorresp,"
                + "codpais"
                + " from cadempresa"
                + " where cgc <> '' limit 5";
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
