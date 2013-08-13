/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.validadores;

/**
 *
 * @author marcos
 */
public class TipoCampoNU {
    
    public String gerarTipoCampoNU(int tamanho) {
        String retorno = "";
        int contador = 0;
        while (contador < tamanho) {
            retorno = retorno + " ";
            contador++;
        }        
        return retorno;
    }
}
