/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.negocio;

import java.sql.ResultSet;
import java.sql.SQLException;
import rm_desbravador.dao.GerarClienteDao;
import rm_desbravador.dao.GerarFornecedorDao;
import rm_desbravador.utilitarios.GravarArquivo;

/**
 *
 * @author marcos
 */
public class GerarArquivoCliente {

    public boolean gerarArquivoCliente() {        
        String mensagem = "";
        GravarArquivo gravar = new GravarArquivo();
        GerarLinhaClienteC gerarLinhaClienteC = new GerarLinhaClienteC();
        GerarLinhaClienteM gerarLinhaClienteM = new GerarLinhaClienteM();
        GerarLinhaClienteD gerarLinhaClienteD = new GerarLinhaClienteD();
        GerarLinhaClienteT gerarLinhaClienteT = new GerarLinhaClienteT();
        GerarLinhaClienteR gerarLinhaClienteR = new GerarLinhaClienteR();
        GerarLinhaClienteO gerarLinhaClienteO = new GerarLinhaClienteO();
        GerarLinhaClienteMC gerarLinhaClienteMC = new GerarLinhaClienteMC();
        GerarLinhaClienteP gerarLinhaClienteP = new GerarLinhaClienteP();
        GerarLinhaClienteE gerarLinhaClienteE = new GerarLinhaClienteE();
        GerarLinhaClienteB gerarLinhaClienteB = new GerarLinhaClienteB();
        GerarLinhaClienteI gerarLinhaClienteI = new GerarLinhaClienteI();
        
        try {
            GerarClienteDao clienteDao = new GerarClienteDao();
            GerarFornecedorDao fornecedorDao = new GerarFornecedorDao();
            ResultSet rsCli = clienteDao.listaDeClientes();
            ResultSet rsFor = fornecedorDao.listaDeFornecedores();            
            //Montar Arquivo Clinte
            //LinhaC
            while(rsCli.next()) {
                mensagem = mensagem + gerarLinhaClienteC.gerarLinhaClienteC(rsCli)+"\n";
                mensagem = mensagem + gerarLinhaClienteM.gerarLinhaClienteM()+"\n";
                mensagem = mensagem + gerarLinhaClienteD.gerarLinhaClienteD()+"\n";
                mensagem = mensagem + gerarLinhaClienteT.gerarLinhaClienteT()+"\n";
                mensagem = mensagem + gerarLinhaClienteR.gerarLinhaClienteR()+"\n";
                mensagem = mensagem + gerarLinhaClienteO.gerarLinhaClienteO()+"\n";
                mensagem = mensagem + gerarLinhaClienteMC.gerarLinhaClienteMC()+"\n";
                mensagem = mensagem + gerarLinhaClienteP.gerarLinhaClienteP()+"\n";
                mensagem = mensagem + gerarLinhaClienteE.gerarLinhaClienteE()+"\n";
                mensagem = mensagem + gerarLinhaClienteB.gerarLinhaClienteB()+"\n";
                mensagem = mensagem + gerarLinhaClienteI.gerarLinhaClienteI()+"\n";
                /*if (rsCli.isLast()) {
                    mensagem = mensagem + gerarLinhaClienteI.gerarLinhaClienteI();
                } else {
                    mensagem = mensagem + gerarLinhaClienteI.gerarLinhaClienteI()+"\n";
                }*/
                
            }                                                
            /*while (rsFor.next()) {
                String nome = rsFor.getString("nomefornec");
                mensagem = mensagem + nome;
            }*/
            gravar.gravarArquivoTexto(mensagem, "teste", "/Users/marcos/Backup");
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
}
