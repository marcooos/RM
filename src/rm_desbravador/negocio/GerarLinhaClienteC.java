/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.negocio;

import java.sql.ResultSet;
import java.sql.SQLException;
import rm_desbravador.validadores.TipoCampoA;
import rm_desbravador.validadores.TipoCampoData;
import rm_desbravador.validadores.TipoCampoF;
import rm_desbravador.validadores.TipoCampoN;
import rm_desbravador.validadores.TipoCampoNU;
import rm_desbravador.validadores.TipoCampoVF;

/**
 *
 * @author marcos
 */
public class GerarLinhaClienteC {

    public String gerarLinhaClienteC(ResultSet rs) {
        TipoCampoF tCF = new TipoCampoF();
        TipoCampoA tCA = new TipoCampoA();
        TipoCampoData tCData = new TipoCampoData();
        TipoCampoN tCN = new TipoCampoN();
        TipoCampoNU tCNU = new TipoCampoNU();
        TipoCampoVF tCVF = new TipoCampoVF();
        String mensagem = "";
        try {
            //Fixo
            mensagem = mensagem + tCF.gerarTipoCampoF("C");
            //Coligada
            mensagem = mensagem + tCN.gerarTipoCampoN(0, 5);
            //Código do cliente
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("codempresa"), 25);
            //Nome Fantasia
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("nomeempresa"), 60);
            //Razão Social
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("razaosocial"), 60);
            //CGC
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("cgc"), 20);
            //Inscrição Estadual
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("inscest"), 20);
            //Cliente (1)
            mensagem = mensagem + tCN.gerarTipoCampoN(1, 5);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(40);            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return mensagem;
    }
}
