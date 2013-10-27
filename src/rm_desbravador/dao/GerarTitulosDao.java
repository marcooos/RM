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
public class GerarTitulosDao {

    public ResultSet listaDeTitulos(boolean tipoBanco, Date data) {
        String sql;
        Connection con;
        Conexao abrirCon = new Conexao();
         TipoCampoData tCD = new TipoCampoData();
        if (tipoBanco) {
            //SQL Server
            sql = "Select codrazao,ce.cgc, ce.codempresa as clifor,"
                    + " 'R' as recpag, dataemi as dtvencto, dataemi as dtemissao, valrazao as valorbruto"
                    + " from razoes rz"
                    + "  join cadempresa ce on rz.codempresa = ce.codempresa"
                    + " where rz.valrazao > 0 and rz.situacao = '' and rz.codempresa > 0"
                    + " and dataemi > ?"
                    + " union "
                    + "Select ad.chave as codrazao, case when ad.codcartao is not null"
                    + "  then ce.cgc"
                    + "  else coalesce((select cgc from cadempresa where ad.titular = nomeempresa limit 1),'000000000000')"
                    + "  end cgc," 
                    + " case when ad.codcartao is not null"
                    + "  then ce.codempresa"
                    + "  else coalesce((select codempresa from cadempresa where ad.titular = nomeempresa limit 1),0)"
                    + "  end codempresa,"
                    + " 'R' as recpag, ad.datalanc as dtvencto, ad.datalanc as dtemissao, ad.valor as valorbruto"
                    + " from adiantamento ad"
                    + "  left join cadempresa ce on ad.codcartao = ce.codempresa"
                    + " where ad.tipoadiant = 'L' and ad.confirmado = 'S' and ad.relancamento <> 'S'"
                    + " and ad.datalanc > ?";
                    
                    
            
        } else {
            //PstgreSQL
            sql = "Select codrazao,ce.cgc, ce.codempresa as clifor,"
                    + " 'R' as recpag, dataemi as dtvencto, dataemi as dtemissao, valrazao as valorbruto"
                    + " from razoes rz"
                    + "  join cadempresa ce on rz.codempresa = ce.codempresa"
                    + " where rz.valrazao > 0 and rz.situacao = '' and rz.codempresa > 0"
                    + " and dataemi > ?"
                    + " union "
                    + "Select ad.chave as codrazao, case when ad.codcartao is not null"
                    + "  then ce.cgc"
                    + "  else coalesce((select cgc from cadempresa where ad.titular = nomeempresa limit 1),'000000000000')"
                    + "  end cgc," 
                    + " case when ad.codcartao is not null"
                    + "  then ce.codempresa"
                    + "  else coalesce((select codempresa from cadempresa where ad.titular = nomeempresa limit 1),0)"
                    + "  end codempresa,"
                    + " 'R' as recpag, ad.datalanc as dtvencto, ad.datalanc as dtemissao, ad.valor as valorbruto"
                    + " from adiantamento ad"
                    + "  left join cadempresa ce on ad.codcartao = ce.codempresa"
                    + " where ad.tipoadiant = 'L' and ad.confirmado = 'S' and ad.relancamento <> 'S'"
                    + " and ad.datalanc > ?";
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
            stmt.setDate(2,tCD.convertDateToSqlDate(data));
            ResultSet rs = stmt.executeQuery();
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }
}
