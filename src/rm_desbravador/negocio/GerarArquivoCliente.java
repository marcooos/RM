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
        
        try {
            GerarClienteDao clienteDao = new GerarClienteDao();
            GerarFornecedorDao fornecedorDao = new GerarFornecedorDao();
            ResultSet rsCli = clienteDao.listaDeClientes();
            ResultSet rsFor = fornecedorDao.listaDeFornecedores();            
            //Montar Arquivo Clinte
            //LinhaC
            mensagem = mensagem + gerarLinhaClienteC.gerarLinhaClienteC(rsCli)+"\n";            
            
            mensagem = mensagem + "----\n";
            
            while (rsFor.next()) {
                String nome = rsFor.getString("nomefornec");
                mensagem = mensagem + nome;
            }
            gravar.gravarArquivoTexto(mensagem, "teste", "/Users/marcos/Backup");
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }
}
