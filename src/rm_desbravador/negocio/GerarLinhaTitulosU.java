/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.negocio;

import java.sql.ResultSet;
import java.sql.SQLException;
import rm_desbravador.validadores.TipoCampoA;
import rm_desbravador.validadores.TipoCampoF;
import rm_desbravador.validadores.TipoCampoN;
import rm_desbravador.validadores.TipoCampoNU;
import rm_desbravador.validadores.TipoCampoVF;

/**
 *
 * @author marcos
 */
public class GerarLinhaTitulosU {

    public String gerarLinhaTitulosU(ResultSet rs) {
        TipoCampoF tCF = new TipoCampoF();
        TipoCampoA tCA = new TipoCampoA();
        TipoCampoN tCN = new TipoCampoN();
        TipoCampoNU tCNU = new TipoCampoNU();
        TipoCampoVF tCVF = new TipoCampoVF();
        String mensagem = "";
        try {
            //Fixo
            mensagem = mensagem + tCF.gerarTipoCampoF("U");
            //Código da coligada
            mensagem = mensagem + tCN.gerarTipoCampoN('1',4);            
            //Código centro de custo
            mensagem = mensagem + tCA.gerarTipoCampoA("1.3.1.01.01.02.02", 25);            
            //Valor
            mensagem = mensagem + tCVF.gerarTipoCampoVF(rs.getDouble("valorbruto"), 18);
            //Histórico
            mensagem = mensagem + tCNU.gerarTipoCampoNU(255);            

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return mensagem;
    }
}
