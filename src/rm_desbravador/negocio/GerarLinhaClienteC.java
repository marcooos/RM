/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.negocio;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.postgresql.util.PSQLException;
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
        boolean clifor;
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
            //Cliente (1) / Fornecedor (2)
            try {
                clifor = rs.getBoolean("situacao");
            } catch (PSQLException ex) {
                clifor = true;
                System.out.println(ex);
            }
            if (clifor) {
                mensagem = mensagem + tCF.gerarTipoCampoF("    1");
            } else {
                mensagem = mensagem + tCF.gerarTipoCampoF("    2");
            }
            
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
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("cidade"),32);            
            //Estado do pagamento
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("estado"),2);
            //CEP do pagamento
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("cep"),9);
            //Telefone do pagamento
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("telefone"),15);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(40);
            //Número entrega
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("complementonr"),8);
            //Complemento entrega
            mensagem = mensagem + tCNU.gerarTipoCampoNU(20);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(20);
            //Cidade entrega
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("cidade"),32);            
            //Estado entrega
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("estado"),2);
            //CEP entrega
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("cep"),9);
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
            mensagem = mensagem + tCN.gerarTipoCampoN(1,5);
            //Limite de crédito
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Valor último lançamento
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
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
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Valor Opcional 2
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Valor Opcional 3
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Data Opcional 1
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Data Opcional 2
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Data Opcional 3
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(15);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(1);
            //Data fundação
            mensagem = mensagem + tCData.gerarTipoCampoData(rs.getDate("dtfunda"));
            //Patrimônio
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Número de funcionários
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
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
            mensagem = mensagem + tCA.gerarTipoCampoAIBGE(rs.getString("codibge"), 20);
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
            //Empresa que a pessoa trabalha
            mensagem = mensagem + tCNU.gerarTipoCampoNU(60);
            //Estado civil
            mensagem = mensagem + tCF.gerarTipoCampoF("S");
            //Produtor rural
            mensagem = mensagem + tCNU.gerarTipoCampoNU(1);
            //Inscrição no suframa
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("suframa"), 14);
            //Contribuinte do icms
            mensagem = mensagem + tCF.gerarTipoCampoF("0");
            //Orgão público
            mensagem = mensagem + tCN.gerarTipoCampoNZerado(5);
            //Telefone comercial
            mensagem = mensagem + tCNU.gerarTipoCampoNU(15);
            //Caixa postal
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Caixa postal pagamento
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Caixa postal Entrega
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Categoria de autonomo
            mensagem = mensagem + tCN.gerarTipoCampoNZerado(5);
            //Código brasileiro de OA
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Categoria do autônomo
            mensagem = mensagem + tCNU.gerarTipoCampoNU(11);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //valor de outras deduções ir
            mensagem = mensagem + tCVF.gerarTipoCampoVFZerado(10);
            //Código da receita
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Não utilizado
            mensagem = mensagem + tCNU.gerarTipoCampoNU(1);
            //CEI
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("cei"), 20);
            //Simples Nacional
            mensagem = mensagem + tCN.gerarTipoCampoNZerado(5);
            //Tipo da rua
            mensagem = mensagem + tCNU.gerarTipoCampoNU(5);
            //Tipo de bairro
            mensagem = mensagem + tCNU.gerarTipoCampoNU(5);
            //Regime ISS
            mensagem = mensagem + tCF.gerarTipoCampoF(" ");
            //Retenção de ISS
            mensagem = mensagem + tCNU.gerarTipoCampoNU(5);
            //Data Nascimento
            mensagem = mensagem + tCData.gerarTipoCampoData(rs.getDate("dtfunda"));
            //Desativar dados
            mensagem = mensagem + tCF.gerarTipoCampoF(" ");
            //IE ST MG
            mensagem = mensagem + tCNU.gerarTipoCampoNU(20);
            //Bairro
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("bairro"), 30);
            //Bairro Entrega
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("bairro"), 30);
            //Bairro Pagamento
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("bairro"), 30);
            //Ramo de atividade
            mensagem = mensagem + tCN.gerarTipoCampoNZerado(2);
            //Rua
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("endereco"), 100);
            //Rua pagamento
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("endereco"), 100);
            //Rua entrega
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("endereco"), 100);
            //Cod pgto GPS
            mensagem = mensagem + tCNU.gerarTipoCampoNU(5);
            //Nascionalidade
            mensagem = mensagem + tCN.gerarTipoCampoNZerado(1);            
            //Código Município pagamento
            mensagem = mensagem + tCA.gerarTipoCampoAIBGE(rs.getString("codibge"), 20);
            //Código Município entrega
            mensagem = mensagem + tCA.gerarTipoCampoAIBGE(rs.getString("codibge"), 20);
            /*
            //IDPais
            mensagem = mensagem + tCN.gerarTipoCampoN(rs.getInt("codpais"), 3);
            //IDPais pgto
            mensagem = mensagem + tCN.gerarTipoCampoN(rs.getInt("codpais"), 3);
            //IDPais Entrega
            mensagem = mensagem + tCN.gerarTipoCampoN(rs.getInt("codpais"), 3);
            //Tipo rua pgto
            mensagem = mensagem + tCN.gerarTipoCampoNZerado(5);
            //Tipo bairro pgto
            mensagem = mensagem + tCN.gerarTipoCampoNZerado(5);
            //Tipo rua Entrega
            mensagem = mensagem + tCN.gerarTipoCampoNZerado(5);
            //Tipo bairro pgto
            mensagem = mensagem + tCN.gerarTipoCampoNZerado(5);*/
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return mensagem;
    }
}
