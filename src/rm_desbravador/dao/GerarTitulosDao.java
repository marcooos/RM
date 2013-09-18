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
public class GerarTitulosDao {

    public ResultSet listaDeTitulos(boolean tipoBanco) {
        String sql;
        Connection con;
        Conexao abrirCon = new Conexao();
        if (tipoBanco) {
            //SQL Server
            sql = "select case when recpag = 'P' \n" +
                    " then cf.cgc\n" +
                    " else ce.cgc\n" +
                    " end cgc,clifor,recpag,dtvencto,dtemissao,valorbruto"
                    + " clifor,recpag,dtvencto,dtemissao,valorbruto"
                    + " from duplicatas dp"
                    + " left join cadempresa ce on (dp.clifor = ce.codempresa and dp.recpag= 'R') and dp.codhotel=1"
                    + " left join cadfornec cf on (dp.clifor = cf.codfornec and dp.recpag= 'P') and cf.codhotel=1";
            
        } else {
            //PstgreSQL
            sql = "select case when recpag = 'P' \n" +
                    " then cf.cgc\n" +
                    " else ce.cgc\n" +
                    " end cgc,clifor,recpag,dtvencto,dtemissao,valorbruto"
                    + " clifor,recpag,dtvencto,dtemissao,valorbruto"
                    + " from duplicatas dp"
                    + " left join cadempresa ce on (dp.clifor = ce.codempresa and dp.recpag= 'R') and dp.codhotel=1"
                    + " left join cadfornec cf on (dp.clifor = cf.codfornec and dp.recpag= 'P') and cf.codhotel=1"
                    + " limit 3";
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
            ResultSet rs = stmt.executeQuery();
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
}
