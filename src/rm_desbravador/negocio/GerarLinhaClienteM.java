/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.negocio;

import rm_desbravador.validadores.TipoCampoF;

/**
 *
 * @author marcos
 */
public class GerarLinhaClienteM {

    public String gerarLinhaClienteM() {
        TipoCampoF tCF = new TipoCampoF();
        String mensagem = "";
        
        //Fixo
        mensagem = mensagem + tCF.gerarTipoCampoF("M");
        return mensagem;
    }
}
