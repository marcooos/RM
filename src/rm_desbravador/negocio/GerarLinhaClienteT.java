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
public class GerarLinhaClienteT {

    public String gerarLinhaClienteT(ResultSet rs) {
        TipoCampoF tCF = new TipoCampoF();
        TipoCampoN tCN = new TipoCampoN();
        TipoCampoNU tCNU = new TipoCampoNU();
        TipoCampoVF tCVF = new TipoCampoVF();
        String mensagem = "";

        //Fixo
        mensagem = mensagem + tCF.gerarTipoCampoF("T");
        //Débito(1)/Crédito(2)
        mensagem = mensagem + tCN.gerarTipoCampoN(2, 5);
        //Cliente(1)/Fornecedor(2)
        mensagem = mensagem + tCN.gerarTipoCampoN(1, 5);
        //Percentual
        mensagem = mensagem + tCVF.gerarTipoCampoVFZerado(10);
        //Código da filial
        mensagem = mensagem + tCN.gerarTipoCampoNZerado(5);
        //Código departamento
        mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
        //Código centro de custo
        mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
        //Código do histórico padrão
        mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
        //Complemento do histórico
        mensagem = mensagem + tCNU.gerarTipoCampoNU(250);
        //Código da coligada
        mensagem = mensagem + tCN.gerarTipoCampoNZerado(5);
        //Código da coligada da conta contábil
        mensagem = mensagem + tCN.gerarTipoCampoNZerado(5);
        //Código da conta contábil
        mensagem = mensagem + tCNU.gerarTipoCampoNU(40);
        //Classificação contábil da conta
        mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
        //Não utilizado
        mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
        return mensagem;
    }
}
