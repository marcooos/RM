/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.negocio;

import rm_desbravador.validadores.TipoCampoData;
import rm_desbravador.validadores.TipoCampoF;
import rm_desbravador.validadores.TipoCampoN;
import rm_desbravador.validadores.TipoCampoNU;
import rm_desbravador.validadores.TipoCampoVF;

/**
 *
 * @author marcos
 */
public class GerarLinhaClienteE {

    public String gerarLinhaClienteE() {
        TipoCampoF tCF = new TipoCampoF();
        TipoCampoN tCN = new TipoCampoN();
        TipoCampoNU tCNU = new TipoCampoNU();
        TipoCampoVF tCVF = new TipoCampoVF();
        TipoCampoData tCData = new TipoCampoData();
        String mensagem = "";

        //Fixo
        mensagem = mensagem + tCF.gerarTipoCampoF("E");
        //CEI
        mensagem = mensagem + tCNU.gerarTipoCampoNU(20);
        //Descrição do CEI
        mensagem = mensagem + tCNU.gerarTipoCampoNU(40);
        //Telefone
        mensagem = mensagem + tCNU.gerarTipoCampoNU(15);
        //Rua
        mensagem = mensagem + tCNU.gerarTipoCampoNU(100);
        //Número
        mensagem = mensagem + tCNU.gerarTipoCampoNU(8);
        //Complemento
        mensagem = mensagem + tCNU.gerarTipoCampoNU(30);
        //Bairro
        mensagem = mensagem + tCNU.gerarTipoCampoNU(30);
        //CEP
        mensagem = mensagem + tCNU.gerarTipoCampoNU(9);
        //Código do município
        mensagem = mensagem + tCNU.gerarTipoCampoNU(20);
        //Código do estado
        mensagem = mensagem + tCNU.gerarTipoCampoNU(2);
        //Código do país
        mensagem = mensagem + tCN.gerarTipoCampoNZerado(5);
        
        return mensagem;
    }
}
