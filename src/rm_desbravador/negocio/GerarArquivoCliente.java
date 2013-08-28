/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.negocio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import rm_desbravador.dao.GerarClienteDao;
import rm_desbravador.dao.GerarFornecedorDao;
import rm_desbravador.utilitarios.GravarArquivo;

/**
 *
 * @author marcos
 */
public class GerarArquivoCliente {
    String mensagem;

    public boolean gerarArquivoCliente(Date data, String caminho,boolean tipoBanco) {        
        mensagem = "";
        GravarArquivo gravar = new GravarArquivo();
        GerarLinhaClienteC gerarLinhaClienteC = new GerarLinhaClienteC();        
        /*GerarLinhaClienteM gerarLinhaClienteM = new GerarLinhaClienteM();
        GerarLinhaClienteD gerarLinhaClienteD = new GerarLinhaClienteD();
        GerarLinhaClienteT gerarLinhaClienteT = new GerarLinhaClienteT();
        GerarLinhaClienteR gerarLinhaClienteR = new GerarLinhaClienteR();
        GerarLinhaClienteO gerarLinhaClienteO = new GerarLinhaClienteO();
        GerarLinhaClienteMC gerarLinhaClienteMC = new GerarLinhaClienteMC();
        GerarLinhaClienteP gerarLinhaClienteP = new GerarLinhaClienteP();
        GerarLinhaClienteE gerarLinhaClienteE = new GerarLinhaClienteE();
        GerarLinhaClienteB gerarLinhaClienteB = new GerarLinhaClienteB();
        GerarLinhaClienteI gerarLinhaClienteI = new GerarLinhaClienteI();*/
        
        try {
            GerarClienteDao clienteDao = new GerarClienteDao();
            GerarFornecedorDao fornecedorDao = new GerarFornecedorDao();
            ResultSet rsCli = clienteDao.listaDeClientes(tipoBanco);
            ResultSet rsFor = fornecedorDao.listaDeFornecedores(tipoBanco);            
            //Montar Arquivo Clinte
            //LinhaC
            while(rsCli.next()) {
                //1
                mensagem = mensagem + gerarLinhaClienteC.gerarLinhaClienteC(rsCli)+"\n";
                //2
                /*mensagem = mensagem + gerarLinhaClienteM.gerarLinhaClienteM()+"\n";
                //3
                mensagem = mensagem + gerarLinhaClienteD.gerarLinhaClienteD()+"\n";
                //4
                mensagem = mensagem + gerarLinhaClienteT.gerarLinhaClienteT()+"\n";
                //5
                mensagem = mensagem + gerarLinhaClienteR.gerarLinhaClienteR()+"\n";
                //6
                mensagem = mensagem + gerarLinhaClienteO.gerarLinhaClienteO()+"\n";
                //7
                mensagem = mensagem + gerarLinhaClienteMC.gerarLinhaClienteMC()+"\n";
                //8
                mensagem = mensagem + gerarLinhaClienteP.gerarLinhaClienteP()+"\n";
                //9
                mensagem = mensagem + gerarLinhaClienteE.gerarLinhaClienteE()+"\n";
                //10
                mensagem = mensagem + gerarLinhaClienteB.gerarLinhaClienteB()+"\n";
                //11
                mensagem = mensagem + gerarLinhaClienteI.gerarLinhaClienteI(rsCli)+"\n";*/                                
            }                                                
            while (rsFor.next()) {
                mensagem = mensagem + gerarLinhaClienteC.gerarLinhaClienteC(rsFor)+"\n";
                //mensagem = mensagem + gerarLinhaFornecedorC.gerarLinhaFornecedorC(rsFor)+"\n";
                /*mensagem = mensagem + gerarLinhaClienteM.gerarLinhaClienteM()+"\n";
                mensagem = mensagem + gerarLinhaClienteD.gerarLinhaClienteD()+"\n";
                mensagem = mensagem + gerarLinhaClienteT.gerarLinhaClienteT()+"\n";
                mensagem = mensagem + gerarLinhaClienteR.gerarLinhaClienteR()+"\n";
                mensagem = mensagem + gerarLinhaClienteO.gerarLinhaClienteO()+"\n";
                mensagem = mensagem + gerarLinhaClienteMC.gerarLinhaClienteMC()+"\n";
                mensagem = mensagem + gerarLinhaClienteP.gerarLinhaClienteP()+"\n";
                mensagem = mensagem + gerarLinhaClienteE.gerarLinhaClienteE()+"\n";
                mensagem = mensagem + gerarLinhaClienteB.gerarLinhaClienteB()+"\n";
                mensagem = mensagem + gerarLinhaClienteI.gerarLinhaClienteI(rsFor)+"\n";*/
                /*if (rsFor.isLast()) {
                    mensagem = mensagem + gerarLinhaClienteI.gerarLinhaClienteI();
                } else {
                    mensagem = mensagem + gerarLinhaClienteI.gerarLinhaClienteI()+"\n";
                }*/
            }
            gravar.gravarArquivoTexto(mensagem, data.toString(), caminho);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
    
    public String getMensagem(){
        return mensagem;
    }
}
