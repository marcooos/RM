/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.negocio;

import rm_desbravador.validadores.TipoCampoF;
import rm_desbravador.validadores.TipoCampoN;

/**
 *
 * @author marcos
 */
public class GerarLinhaClienteB {

    public String gerarLinhaClienteB() {
        TipoCampoF tCF = new TipoCampoF();
        TipoCampoN tCN = new TipoCampoN();
        String mensagem = "";

        //Fixo
        mensagem = mensagem + tCF.gerarTipoCampoF("B");
        //Código fo tributo
        mensagem = mensagem + tCN.gerarTipoCampoNZerado(10);
        
        return mensagem;
    }
}
