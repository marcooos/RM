/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.validadores;

/**
 *
 * @author marcos
 */
public class TipoCampoA {
    
    public String gerarTipoCampoA(String campo, int tamanho) {
        String retorno = "";
        int contador = campo.length();
        while (contador < tamanho) {
            retorno = retorno + " ";
            contador++;
        }
        retorno = campo + retorno;
        return retorno;
    }
}
