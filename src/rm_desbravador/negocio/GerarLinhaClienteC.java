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
            while (rs.next()) {
                mensagem = mensagem + tCF.gerarTipoCampoF("C");
                mensagem = mensagem + tCN.gerarTipoCampoN(0, 5);
                mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("codempresa"), 25);
                mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("nomeempresa"), 60);
                mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("razaosocial"), 60);
                mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("cgc"), 20);
                mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("inscest"), 20);
                mensagem = mensagem + "\n";
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return mensagem;
    }
}
