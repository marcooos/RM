/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.visao;

import javax.swing.UIManager;
/**
 *
 * @author marcos
 */
public class RM_Desbravador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
            UIPrincipal uip = new UIPrincipal();
            uip.iniciarInterface();
            uip.pack();
            uip.setLocationRelativeTo(null);
            uip.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
        // GerarArquivoCliente gerarArquivoCliente = new GerarArquivoCliente();
        // System.out.println(gerarArquivoCliente.gerarArquivoCliente());                

    }
}
