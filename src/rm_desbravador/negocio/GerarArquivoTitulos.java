/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.negocio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import rm_desbravador.dao.GerarTitulosDao;
import rm_desbravador.utilitarios.GravarArquivo;

/**
 *
 * @author marcos
 */
public class GerarArquivoTitulos {
    String mensagem;

    public boolean gerarArquivoTitulos(Date data, String caminho,boolean tipoBanco) {        
        mensagem = "";
        GravarArquivo gravar = new GravarArquivo();
        GerarLinhaTitulosL gerarLinhaTitulosL = new GerarLinhaTitulosL();        
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
            GerarTitulosDao titulosDao = new GerarTitulosDao();
            ResultSet rsTitulos = titulosDao.listaDeTitulos(tipoBanco);
            
            //Montar Arquivo Clinte
            //LinhaC
            while(rsTitulos.next()) {
                //1
                mensagem = mensagem + gerarLinhaTitulosL.gerarLinhaTitulosL(rsTitulos)+"\n";
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
