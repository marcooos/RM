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
        int contador;
        try {
            contador = campo.length();
            if (contador > tamanho) {
                retorno = String.valueOf(campo).substring(0, tamanho);
                return retorno;
            } else  {
                if (contador < tamanho) {
                while (contador < tamanho) {
                    retorno = retorno + " ";
                    contador++;
                }
                retorno = campo + retorno;
            } else {
                retorno = campo.substring(0, tamanho);
            }
            return retorno;
            }            
        } catch (NullPointerException ex) {
            System.out.println(ex);
            return gerarTipoCampoAZerado(tamanho);
        }

    }
    
    public String gerarTipoCampoAISENTO(String campo, int tamanho) {
        String retorno = "";
        int contador;
        try {
            contador = campo.length();
            if (contador < tamanho) {
                while (contador < tamanho) {
                    retorno = retorno + " ";
                    contador++;
                }
                retorno = campo + retorno;
            } else {
                retorno = campo.substring(0, tamanho);
            }
            return retorno;
        } catch (NullPointerException ex) {
            System.out.println(ex);
            return gerarTipoCampoA("ISENTO",tamanho);
        }

    }

    public String gerarTipoCampoAZerado(int tamanho) {
        String retorno = "";
        int contador = 0;
        while (contador < tamanho) {
            retorno = retorno + " ";
            contador++;
        }
        return retorno;
    }
}
