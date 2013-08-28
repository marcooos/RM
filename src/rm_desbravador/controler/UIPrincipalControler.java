/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.controler;

import java.util.Date;
import rm_desbravador.negocio.GerarArquivoCliente;

/**
 *
 * @author marcos
 */
public class UIPrincipalControler {
    String mensagem;
    
    public String gerarAquivoClientes(Date data, String caminho, boolean tipoBanco) {
        GerarArquivoCliente gerarArquivoCliente = new GerarArquivoCliente();
        gerarArquivoCliente.gerarArquivoCliente(data,caminho,tipoBanco);        
        return gerarArquivoCliente.getMensagem();
    }
}
