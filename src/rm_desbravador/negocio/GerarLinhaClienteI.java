/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.negocio;

import java.sql.ResultSet;
import java.sql.SQLException;
import rm_desbravador.validadores.TipoCampoA;
import rm_desbravador.validadores.TipoCampoF;

/**
 *
 * @author marcos
 */
public class GerarLinhaClienteI {

    public String gerarLinhaClienteI(ResultSet rs) {
        TipoCampoF tCF = new TipoCampoF();
        TipoCampoA tCA = new TipoCampoA();
        String mensagem = "";

        //Fixo
        mensagem = mensagem + tCF.gerarTipoCampoF("I");
        try {
            //Estado da inscrição estadual
            mensagem = mensagem + tCA.gerarTipoCampoA(rs.getString("estado"), 2);
            //Inscrição estadual
            mensagem = mensagem + tCA.gerarTipoCampoAISENTO(rs.getString("inscest"), 20);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return mensagem;
    }
}
