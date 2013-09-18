/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.negocio;

import com.microsoft.sqlserver.jdbc.SQLServerException;
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
public class GerarLinhaTitulosL {

    public String gerarLinhaTitulosL(ResultSet rs) {
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
            mensagem = mensagem + tCF.gerarTipoCampoF("L");
            //Código banco CNAB
            mensagem = mensagem + tCNU.gerarTipoCampoNU(3);
            //Código da filial
            mensagem = mensagem + tCN.gerarTipoCampoNZerado(4);
            //Código fornecedor
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("clifor"), 25);
            //Código do tipo de Documento
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Número do Documento
            mensagem = mensagem + tCNU.gerarTipoCampoNU(40);
            //Não utilizado (Espaços)
            mensagem = mensagem + tCNU.gerarTipoCampoNU(3);
            //Status do Faturamento
            mensagem = mensagem + tCNU.gerarTipoCampoNU(1);
            //Não utilizado (Espaços)
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Não utilizado (Espaços)
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //1 = A Receber / 2 = A Pagar
            //A Pagar ou A Receber            
            if ("P".equals(rs.getString("recpag"))) {
                mensagem = mensagem + tCF.gerarTipoCampoF("2");                
            } else {
                mensagem = mensagem + tCF.gerarTipoCampoF("1");                
            }            
            //Código da Tabela Opcional 1
            mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
            //Código da Tabela Opcional 2
            mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
            //Código da Tabela Opcional 3
            mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
            //Código da Tabela Opcional 4
            mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
            //Código da Tabela Opcional 5
            mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
            //Código do Departamento
            mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
            //Código do Centro de Custo
            mensagem = mensagem + tCNU.gerarTipoCampoNU(25);
            //Data de Vencimento
            mensagem = mensagem + tCData.gerarTipoCampoData(rs.getDate("dtvencto"));
            //Data de Emissão
            mensagem = mensagem + tCData.gerarTipoCampoData(rs.getDate("dtemissao"));
            //Não utilizado (Espaços)
            mensagem = mensagem + tCNU.gerarTipoCampoNU(6);
            //Data de Previsão de Baixa
            mensagem = mensagem + tCNU.gerarTipoCampoNU(6);
            //Data de Contabilização
            mensagem = mensagem + tCNU.gerarTipoCampoNU(6);
            //Data de Cancelamento
            mensagem = mensagem + tCNU.gerarTipoCampoNU(6);
            //Não utilizado (Espaços)
            mensagem = mensagem + tCNU.gerarTipoCampoNU(6);
            //Não utilizado (Espaços)
            mensagem = mensagem + tCNU.gerarTipoCampoNU(6);
            //Não utilizado (Espaços)
            mensagem = mensagem + tCNU.gerarTipoCampoNU(6);
            //Não utilizado (Espaços)
            mensagem = mensagem + tCNU.gerarTipoCampoNU(100);
            //Tipo Contábil
            mensagem = mensagem + tCNU.gerarTipoCampoNU(1);
            //Código da moeda
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Código do Indexador
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Código da Conta/Caixa
            mensagem = mensagem + tCNU.gerarTipoCampoNU(10);
            //Valor Original
            mensagem = mensagem + tCVF.gerarTipoCampoVF(rs.getDouble("valorbruto"), 18);

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return mensagem;
    }
}
