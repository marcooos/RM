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
public class GerarFornecedorDao {

    public ResultSet listaDeFornecedores() {
        Connection con;
        Conexao abrirCon = new Conexao();
        String sql = "select codfornec as codempresa,nomefornec as nomeempresa,razaosocial,cgc,inscest,"
                + "' ' as complementonr,email,' ' as complemento,estado,cep,telefone1 as telefone, cidade as cobcidade,"
                + "estado as cobestado,cep as cobcep,telefone1 as cobfone, numero as nroendcorresp,cidade as cidadecorresp,"
                + "estado as estadocorresp,cep as cepcorresp,fax,datareg as dtfunda,inscmunic as inscmunicipal,'F' as tipoemp,pais,"
                + "codibge, suframa,' ' as cei,bairro, endereco, endereco as cobendereco, endereco as enderecocorresp,codpais,situacao"
                + " from cadfornec "
                + " where cgc <> '' limit 1";
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
