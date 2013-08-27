/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador;

import rm_desbravador.visao.UIPrincipal;


/**
 *
 * @author marcos
 */
public class RM_Desbravador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UIPrincipal uip = new UIPrincipal();
        uip.iniciarInterface();
        uip.setVisible(true);
       // GerarArquivoCliente gerarArquivoCliente = new GerarArquivoCliente();
       // System.out.println(gerarArquivoCliente.gerarArquivoCliente());                
        
    }
}
