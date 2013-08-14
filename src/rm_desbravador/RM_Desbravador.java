/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador;

import java.sql.ResultSet;
import java.sql.SQLException;
import rm_desbravador.dao.GerarClienteDao;
import rm_desbravador.dao.GerarFornecedorDao;
import rm_desbravador.utilitarios.GravarArquivo;

/**
 *
 * @author marcos
 */
public class RM_Desbravador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        String mensagem = "";
        try {
            GerarClienteDao clienteDao = new GerarClienteDao();
            GerarFornecedorDao fornecedorDao = new GerarFornecedorDao();
            ResultSet rsCli = clienteDao.listaDeClientes();
            ResultSet rsFor = fornecedorDao.listaDeFornecedores();
            while (rsCli.next()) {
                String nome = rsCli.getString("nomeempresa");
                mensagem = mensagem + nome + "\n";
            }                
                mensagem = mensagem + "----\n";
            while (rsFor.next()) {
                String nome = rsFor.getString("nomefornec");
                mensagem = mensagem + nome;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        GravarArquivo gravar = new GravarArquivo();
        gravar.gravarArquivoTexto(mensagem, "teste", "/Users/marcos/Backup");
    }
}
