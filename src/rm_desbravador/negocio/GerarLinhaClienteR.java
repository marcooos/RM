/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.negocio;

import java.sql.ResultSet;
import rm_desbravador.validadores.TipoCampoF;
import rm_desbravador.validadores.TipoCampoN;
import rm_desbravador.validadores.TipoCampoNU;
import rm_desbravador.validadores.TipoCampoVF;

/**
 *
 * @author marcos
 */
public class GerarLinhaClienteR {

    public String gerarLinhaClienteR() {
        TipoCampoF tCF = new TipoCampoF();
        TipoCampoN tCN = new TipoCampoN();
        TipoCampoNU tCNU = new TipoCampoNU();
        TipoCampoVF tCVF = new TipoCampoVF();
        String mensagem = "";

        //Fixo
        mensagem = mensagem + tCF.gerarTipoCampoF("R");
        //Não utilizado
        mensagem = mensagem + tCNU.gerarTipoCampoNU(5);
        //Não utilizado
        mensagem = mensagem + tCNU.gerarTipoCampoNU(5);
        //Não utilizado
        mensagem = mensagem + tCNU.gerarTipoCampoNU(5);
        //Não utilizado
        mensagem = mensagem + tCNU.gerarTipoCampoNU(5);
        //Não utilizado
        mensagem = mensagem + tCNU.gerarTipoCampoNU(40);
        //Código da coligada da conta gerencial
        mensagem = mensagem + tCN.gerarTipoCampoNZerado(5);
        //Código da conta gerencial
        mensagem = mensagem + tCN.gerarTipoCampoNZerado(40);
        //Percentual
        mensagem = mensagem + tCVF.gerarTipoCampoVFZerado(10);
        //Não utilizado
        mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
        return mensagem;
    }
}
