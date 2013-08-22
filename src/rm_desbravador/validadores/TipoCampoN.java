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

        try {
            int contador = String.valueOf(campo).length();
            if (contador > tamanho) {
                retorno = String.valueOf(campo).substring(0, tamanho);
                return retorno;
            } else  {
                while (contador < tamanho) {
                retorno = retorno + "0";
                contador++;
            }
            retorno = retorno + campo;
            return retorno;
            }            
        } catch (NullPointerException ex) {
            System.out.println(ex);
            return gerarTipoCampoNZerado(tamanho);
        }

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
