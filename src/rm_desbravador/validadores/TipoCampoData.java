/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.validadores;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author marcos
 */
public class TipoCampoData {

    public String gerarTipoCampoData(Date data) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(data);        
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        return dataFormatada.format(gc.getTime());
    }
    
    public String gerarTipoCampoDataZerado() {
        return "01/01/1989";
    }
}
