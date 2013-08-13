/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.validadores;

/**
 *
 * @author marcos
 */
public class TipoCampoN {

    public String gerarTipoCampoN(int campo, int tamanho) {
        String retorno = "";
        int contador = String.valueOf(campo).length();
        while (contador < tamanho) {
            retorno = retorno + "0";
            contador++;
        }
        retorno = retorno + campo;
        return retorno;
    }
    
    public String gerarTipoCampoNZerado(int tamanho) {
        String retorno = "";
        int contador = 0;
        while (contador < tamanho) {
            retorno = retorno + "0";
            contador++;
        }        
        return retorno;
    }
}
