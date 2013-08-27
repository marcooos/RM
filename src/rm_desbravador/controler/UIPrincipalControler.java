/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.controler;

import rm_desbravador.negocio.GerarArquivoCliente;

/**
 *
 * @author marcos
 */
public class UIPrincipalControler {
    
    public String gerarAquivoClientes() {
        GerarArquivoCliente gerarArquivoCliente = new GerarArquivoCliente();
        gerarArquivoCliente.gerarArquivoCliente();
        return null;
    }
}
