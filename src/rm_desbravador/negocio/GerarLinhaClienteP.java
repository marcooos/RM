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
public class GerarLinhaClienteP {

    public String gerarLinhaClienteP() {
        TipoCampoF tCF = new TipoCampoF();
        TipoCampoN tCN = new TipoCampoN();
        TipoCampoNU tCNU = new TipoCampoNU();
        TipoCampoVF tCVF = new TipoCampoVF();
        TipoCampoData tCData = new TipoCampoData();
        String mensagem = "";

        //Fixo
        mensagem = mensagem + tCF.gerarTipoCampoF("P");
        //Dados bancários
        mensagem = mensagem + tCNU.gerarTipoCampoNU(40);
        //Forma de pagamento /débito
        mensagem = mensagem + tCF.gerarTipoCampoF("I");
        //Número do banco
        mensagem = mensagem + tCN.gerarTipoCampoNZerado(4);
        //Código da agência
        mensagem = mensagem + tCN.gerarTipoCampoNZerado(4);
        //Dígito da agência
        mensagem = mensagem + tCNU.gerarTipoCampoNU(1);
        //Conta corrente
        mensagem = mensagem + tCNU.gerarTipoCampoNU(15);
        //Dígito da conta
        mensagem = mensagem + tCNU.gerarTipoCampoNU(2);
        //Nome da agência
        mensagem = mensagem + tCNU.gerarTipoCampoNU(30);
        //Não utilizado
        mensagem = mensagem + tCNU.gerarTipoCampoNU(4);
        //Câmara de compensação
        mensagem = mensagem + tCN.gerarTipoCampoNZerado(4);
        //Tipo da conta
        mensagem = mensagem + tCN.gerarTipoCampoNZerado(2);
        //Tipo do DOC
        mensagem = mensagem + tCNU.gerarTipoCampoNU(1);
        //Código da finalidade do DOC
        mensagem = mensagem + tCN.gerarTipoCampoNZerado(2);
        //Favorecido
        mensagem = mensagem + tCNU.gerarTipoCampoNU(60);
        //CNPJ/CPF do favorecido
        mensagem = mensagem + tCNU.gerarTipoCampoNU(20);
        return mensagem;
    }
}
