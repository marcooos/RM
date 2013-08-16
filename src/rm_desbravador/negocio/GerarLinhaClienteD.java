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
import rm_desbravador.validadores.TipoPessoa;

/**
 *
 * @author marcos
 */
public class GerarLinhaClienteD {

    public String gerarLinhaClienteD(ResultSet rs) {
        TipoCampoF tCF = new TipoCampoF();
        TipoCampoA tCA = new TipoCampoA();
        TipoCampoData tCData = new TipoCampoData();
        TipoCampoN tCN = new TipoCampoN();
        TipoCampoNU tCNU = new TipoCampoNU();
        TipoCampoVF tCVF = new TipoCampoVF();
        TipoPessoa tP = new TipoPessoa();
        String mensagem = "";        
        
            //Fixo
            mensagem = mensagem + tCF.gerarTipoCampoF("D");
            //Tabela opcional 1
            mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
            //Tabela opcional 2
            mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
            //Tabela opcional 3
            mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
            //Tabela opcional 4
            mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
            //Tabela opcional 5
            mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
            //Departamento
            mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
            //Centro de custo
            mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
            //Filial
            mensagem = mensagem + tCN.gerarTipoCampoN(0, 5);
            //Coligada
            mensagem = mensagem + tCN.gerarTipoCampoN(0, 5);
            //Cod. do banco de cobrança
            mensagem = mensagem + tCNU.gerarTipoCampoNU(3);
            //Cod. de carteira de cobrança
            mensagem = mensagem + tCN.gerarTipoCampoN(0, 5);
            //Não utilizar
            mensagem = mensagem + tCNU.gerarTipoCampoNU(5);
            //Cód. vendedor
            mensagem = mensagem + tCNU.gerarTipoCampoNU(16);
            //Percentual de desconto
            mensagem = mensagem + tCVF.gerarTipoCampoVFZerado(12);
            //Rep. por cli/for
            mensagem = mensagem + tCNU.gerarTipoCampoNU(15);
            //Default tipo doc
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Coligada conta caixa
            mensagem = mensagem + tCN.gerarTipoCampoN(0, 5);
            //Conta caixa
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Transportador
            mensagem = mensagem + tCNU.gerarTipoCampoNU(5);
            //Cod. de receita inss
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Não utilizar
            mensagem = mensagem + tCNU.gerarTipoCampoNU(5);
            //Tipo contabil
            mensagem = mensagem + tCNU.gerarTipoCampoNU(1);

        return mensagem;
    }
}
