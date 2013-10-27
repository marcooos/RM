/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import rm_desbravador.utilitarios.Conexao;
import rm_desbravador.utilitarios.PropertiesLoaderImpl;
import rm_desbravador.validadores.TipoCampoData;

/**
 *
 * @author marcos
 */
public class GerarClienteDao {

    public ResultSet listaDeClientes(boolean tipoBanco, Date data) {
        String sql;
        Connection con;
        Conexao abrirCon = new Conexao();
        TipoCampoData tCD = new TipoCampoData();
        
        if (tipoBanco) {
            sql = "select codempresa,nomeempresa,razaosocial,cgc,inscest,cidade,"
                    + "complementonr,email,complemento,estado,cep,telefone, cobcidade,"
                    + "cobestado,cobcep, cobfone, nroendcorresp,cidadecorresp,"
                    + "estadocorresp,cepcorresp,fax,dtfunda,inscmunicipal,tipoemp,pais,"
                    + "codibge, suframa,cei,bairro, endereco, cobendereco, enderecocorresp,"
                    + "codpais"
                    + " from cadempresa"
                    + " where cgc <> ' ' and datacad > ? ";
            
        } else {
            sql = "select codempresa,nomeempresa,razaosocial,cgc,inscest,cidade,"
                    + "complementonr,email,complemento,estado,cep,telefone, cobcidade,"
                    + "cobestado,cobcep, cobfone, nroendcorresp,cidadecorresp,"
                    + "estadocorresp,cepcorresp,fax,dtfunda,inscmunicipal,tipoemp,pais,"
                    + "codibge, suframa,cei,bairro, endereco, cobendereco, enderecocorresp,"                
                    + "codpais"
                    + " from cadempresa"
                    + " where cgc <> ' ' and datacad > ? ";
        }
        con = abrirCon.getConexao(
                PropertiesLoaderImpl.getValor("servidor"),
                PropertiesLoaderImpl.getValor("porta"),
                PropertiesLoaderImpl.getValor("banco"),
                PropertiesLoaderImpl.getValor("usuario"),
                PropertiesLoaderImpl.getValor("senha"),
                tipoBanco);
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setDate(1,tCD.convertDateToSqlDate(data));
            ResultSet rs = stmt.executeQuery();
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
}
