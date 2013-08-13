/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador;

import java.util.Date;
import rm_desbravador.utilitarios.Conexao;
import rm_desbravador.utilitarios.PropertiesLoaderImpl;
import rm_desbravador.validadores.TipoCampoData;

/**
 *
 * @author marcos
 */
public class RM_Desbravador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean testeCon;
        Conexao con = new Conexao();
        TipoCampoData tn = new TipoCampoData();
        testeCon = con.getConexao(
                PropertiesLoaderImpl.getValor("servidor"),
                PropertiesLoaderImpl.getValor("porta"),
                PropertiesLoaderImpl.getValor("banco"),
                PropertiesLoaderImpl.getValor("usuario"),
                PropertiesLoaderImpl.getValor("senha"));
        System.out.println(testeCon + "\n" + con.getMensagemRet());
        System.out.println(
                tn.gerarTipoCampoData(new Date("January 2, 1970, 00:00:00 GMT")) + "\n"
                + tn.gerarTipoCampoDataZerado());
    }
}
