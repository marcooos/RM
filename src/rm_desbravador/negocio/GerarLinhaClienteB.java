/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.negocio;

import rm_desbravador.validadores.TipoCampoF;
import rm_desbravador.validadores.TipoCampoNU;

/**
 *
 * @author marcos
 */
public class GerarLinhaClienteB {

    public String gerarLinhaClienteB() {
        TipoCampoF tCF = new TipoCampoF();
        TipoCampoNU tCNU = new TipoCampoNU();
        String mensagem = "";

        //Fixo
        mensagem = mensagem + tCF.gerarTipoCampoF("B");
        //Código fo tributo
        mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
        
        return mensagem;
    }
}
