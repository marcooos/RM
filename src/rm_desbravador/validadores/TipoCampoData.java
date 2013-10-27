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
        try {
            gc.setTime(data);
            SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
            return dataFormatada.format(gc.getTime());
        } catch (NullPointerException ex) {
            System.out.println(ex);
            return gerarTipoCampoDataZerado();
        }
    }

    public String gerarTipoCampoDataSemFormatacao(Date data) {
        GregorianCalendar gc = new GregorianCalendar();
        try {
            gc.setTime(data);
            SimpleDateFormat dataFormatada = new SimpleDateFormat("ddMMyy");
            return dataFormatada.format(gc.getTime());
        } catch (NullPointerException ex) {
            System.out.println(ex);
            return gerarTipoCampoDataZerado();
        }
    }

    public String gerarTipoCampoDataZerado() {
        return "01/01/1989";
    }

    public java.sql.Date convertDateToSqlDate(Date data) {
        if (data == null) {
            return null;
        } else {
            return new java.sql.Date(data.getTime());
        }
    }
}
