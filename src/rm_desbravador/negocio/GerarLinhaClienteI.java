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
public class GerarLinhaClienteI {
     
    public String gerarLinhaClienteI() {
        TipoCampoF tCF = new TipoCampoF();
        TipoCampoNU tCNU = new TipoCampoNU();
        String mensagem = "";

        //Fixo
        mensagem = mensagem + tCF.gerarTipoCampoF("I");
        //Estado da inscrição estadual
        mensagem = mensagem + tCNU.gerarTipoCampoNU(2);
        //Inscrição estadual
        mensagem = mensagem + tCNU.gerarTipoCampoNU(20);        
        return mensagem;
    }
}
