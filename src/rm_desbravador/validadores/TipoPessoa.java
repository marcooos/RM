/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.validadores;

/**
 *
 * @author marcos
 */
public class TipoPessoa {
    public String validarTipoPessoa(String campo){
          if ("F".equals(campo)) {
              return "F";
          } else {
              return "J";
          }
    }
    
}
