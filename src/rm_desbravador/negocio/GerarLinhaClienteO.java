/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.negocio;

import java.sql.ResultSet;
import rm_desbravador.validadores.TipoCampoData;
import rm_desbravador.validadores.TipoCampoF;
import rm_desbravador.validadores.TipoCampoN;
import rm_desbravador.validadores.TipoCampoNU;

/**
 *
 * @author marcos
 */
public class GerarLinhaClienteO {

    public String gerarLinhaClienteO() {
        TipoCampoF tCF = new TipoCampoF();
        TipoCampoN tCN = new TipoCampoN();
        TipoCampoNU tCNU = new TipoCampoNU();        
        TipoCampoData tCData = new TipoCampoData();
        
        String mensagem = "";
        //Fixo
        mensagem = mensagem + tCF.gerarTipoCampoF("O");
        //Nome do contato
        mensagem = mensagem + tCNU.gerarTipoCampoNU(50);
        //E-mail do contato
        mensagem = mensagem + tCNU.gerarTipoCampoNU(80);
        //Telefone de contato
        mensagem = mensagem + tCNU.gerarTipoCampoNU(15);
        //Ramal do contato
        mensagem = mensagem + tCNU.gerarTipoCampoNU(6);
        //Fax do contato
        mensagem = mensagem + tCNU.gerarTipoCampoNU(15);
        //Função
        mensagem = mensagem + tCNU.gerarTipoCampoNU(50);
        //Observação
        mensagem = mensagem + tCNU.gerarTipoCampoNU(80);
        //Não utilizado
        mensagem = mensagem + tCNU.gerarTipoCampoNU(40);
        //Número
        mensagem = mensagem + tCNU.gerarTipoCampoNU(8);
        //Complemento
        mensagem = mensagem + tCNU.gerarTipoCampoNU(30);
        //Bairro
        mensagem = mensagem + tCNU.gerarTipoCampoNU(30);
        //Cidade
        mensagem = mensagem + tCNU.gerarTipoCampoNU(32);
        //UF
        mensagem = mensagem + tCNU.gerarTipoCampoNU(2);
        //CEP
        mensagem = mensagem + tCNU.gerarTipoCampoNU(9);
        //País
        mensagem = mensagem + tCNU.gerarTipoCampoNU(20);
        //Ativo
        mensagem = mensagem + tCN.gerarTipoCampoN(1,1);
        //Data de nascimento
        mensagem = mensagem + tCData.gerarTipoCampoDataZerado();
        //E-mail padrão de compras
        mensagem = mensagem + tCN.gerarTipoCampoNZerado(1);
        //Não utilizado
        mensagem = mensagem + tCNU.gerarTipoCampoNU(2);
        //Rua endereço
        mensagem = mensagem + tCNU.gerarTipoCampoNU(100);   
        return mensagem;
    }
}
