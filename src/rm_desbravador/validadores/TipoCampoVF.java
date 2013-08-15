/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.validadores;

/**
 *
 * @author marcos
 */
public class TipoCampoVF {

    public String gerarTipoCampoVF(double campo, int tamanho) {
        String retorno = "";
        try {
            int contador = String.valueOf(campo).length();
            while (contador < tamanho) {
                retorno = retorno + "0";
                contador++;
            }
            retorno = retorno + campo;
            return retorno;
        } catch (NullPointerException ex) {
            System.out.println(ex);
            return gerarTipoCampoVFZerado(tamanho);
        }
    }

    public String gerarTipoCampoVFZerado(int tamanho) {
        String retorno = "";
        double valorPadrao = 0.00;
        int contador = String.valueOf(valorPadrao).length();
        while (contador < tamanho) {
            retorno = retorno + "0";
            contador++;
        }
        retorno = retorno + valorPadrao;
        return retorno;
    }
}
