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
public class GerarLinhaClienteC {

    public String gerarLinhaClienteC(ResultSet rs) {
        TipoCampoF tCF = new TipoCampoF();
        TipoCampoA tCA = new TipoCampoA();
        TipoCampoData tCData = new TipoCampoData();
        TipoCampoN tCN = new TipoCampoN();
        TipoCampoNU tCNU = new TipoCampoNU();
        TipoCampoVF tCVF = new TipoCampoVF();
        TipoPessoa tP = new TipoPessoa();
        String mensagem = "";
        try {
            //Fixo
            mensagem = mensagem + tCF.gerarTipoCampoF("C");
            //Coligada
            mensagem = mensagem + tCN.gerarTipoCampoN(0, 5);
            //Código do cliente
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("codempresa"), 25);
            //Nome Fantasia
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("nomeempresa"), 60);
            //Razão Social
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("razaosocial"), 60);
            //CGC
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("cgc"), 20);
            //Inscrição Estadual
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("inscest"), 20);
            //Cliente (1)
            mensagem = mensagem + tCN.gerarTipoCampoN(1, 5);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(40);
            //Numero
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("complementonr"), 8);
            //Complemento
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("complemento"), 20);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(20);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(32);
            //Estado
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("estado"), 2);
            //Estado
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("cep"), 9);
            //Telefone
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("telefone"), 15);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(40);
            //Número do pagamento
            mensagem = mensagem + tCNU.gerarTipoCampoNU(8);
            //Complemento do pagamento
            mensagem = mensagem + tCNU.gerarTipoCampoNU(20);            
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(20);
            //Cidade do pagamento
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("cobcidade"),32);            
            //Estado do pagamento
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("cobestado"),2);
            //CEP do pagamento
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("cobcep"),9);
            //Telefone do pagamento
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("cobfone"),15);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(40);
            //Número entrega
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("nroendcorresp"),8);
            //Complemento entrega
            mensagem = mensagem + tCNU.gerarTipoCampoNU(20);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(20);
            //Cidade entrega
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("cidadecorresp"),32);            
            //Estado entrega
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("estadocorresp"),2);
            //CEP entrega
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("cepcorresp"),9);
            //Telefone entrega
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("telefone"),15);
            //Fax
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("fax"),15);
            //Celular
            mensagem = mensagem + tCNU.gerarTipoCampoNU(15);
            //E-mail
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("email"),60);
            //Contato
            mensagem = mensagem + tCNU.gerarTipoCampoNU(40);
            //Tipo de cliente/Fornecedor
            mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
            //Ativo (0 - Não / 1 - Sim)
            mensagem = mensagem + tCA.gerarTipoCampoA("1",5);
            //Limite de crédito
            mensagem = mensagem + tCVF.gerarTipoCampoVFZerado(10);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Valor último lançamento
            mensagem = mensagem + tCVF.gerarTipoCampoVFZerado(10);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(5);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Campo Livre
            mensagem = mensagem + tCNU.gerarTipoCampoNU(40);            
            //Campo Alfa 1
            mensagem = mensagem + tCNU.gerarTipoCampoNU(40);
            //Campo Alfa 2
            mensagem = mensagem + tCNU.gerarTipoCampoNU(40);
            //Campo Alfa 3
            mensagem = mensagem + tCNU.gerarTipoCampoNU(40);
            //Valor Opcional 1
            mensagem = mensagem + tCVF.gerarTipoCampoVFZerado(10);
            //Valor Opcional 2
            mensagem = mensagem + tCVF.gerarTipoCampoVFZerado(10);
            //Valor Opcional 3
            mensagem = mensagem + tCVF.gerarTipoCampoVFZerado(10);
            //Data Opcional 1
            mensagem = mensagem + tCData.gerarTipoCampoDataZerado();
            //Data Opcional 2
            mensagem = mensagem + tCData.gerarTipoCampoDataZerado();
            //Data Opcional 3
            mensagem = mensagem + tCData.gerarTipoCampoDataZerado();
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(15);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(1);
            //Data fundação
            mensagem = mensagem + tCData.gerarTipoCampoData(rs.getDate("dtfunda"));
            //Patrimônio
            mensagem = mensagem + tCVF.gerarTipoCampoVFZerado(10);
            //Número de funcionários
            mensagem = mensagem + tCN.gerarTipoCampoNZerado(10);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(94);
            //Coligado do tipo cli/for
            mensagem = mensagem + tCNU.gerarTipoCampoNU(5);
            //Fax Dedicado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(5);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(5);
            //Inscrição municipal
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("inscmunicipal"), 20);
            //Pessoa física (F) / jurídica (J)
            mensagem = mensagem + tP.validarTipoPessoa(rs.getString("tipoemp"));
            //Contato Pagamento
            mensagem = mensagem + tCNU.gerarTipoCampoNU(40);
            //Contato Entrega
            mensagem = mensagem + tCNU.gerarTipoCampoNU(40);
            //Pais
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("pais"), 20);
            //Pais pagamento
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("pais"), 20);
            //Pais entrega
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("pais"), 20);
            //Fax entrega
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("fax"), 15);
            //E-mail entrega
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("email"), 60);
            //Fax pagamento
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("fax"), 15);
            //E-mail pagamento
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("email"), 60);
            //Carteira de identidade
            mensagem = mensagem + tCNU.gerarTipoCampoNU(20);
            //Orgão emissor
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //estado emissor
            mensagem = mensagem + tCNU.gerarTipoCampoNU(2);
            //Código Município
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("codibge"), 20);
            //Código fornecedor imobilizado
            mensagem = mensagem + tCN.gerarTipoCampoNZerado(5);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(1);
            //Código cargo
            mensagem = mensagem + tCNU.gerarTipoCampoNU(3);
            //Vinculo empregatício
            mensagem = mensagem + tCNU.gerarTipoCampoNU(1);
            //valor do frete do fornecedor
            mensagem = mensagem + tCVF.gerarTipoCampoVFZerado(10);
            //Tipo tomador
            mensagem = mensagem + tCN.gerarTipoCampoNZerado(5);
            //Contribuinte ISS
            mensagem = mensagem + tCN.gerarTipoCampoNZerado(5);
            //Número de dependentes
            mensagem = mensagem + tCN.gerarTipoCampoNZerado(10);
            
            
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return mensagem;
    }
}
