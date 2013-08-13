/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador;

import rm_desbravador.utilitarios.Conexao;
import rm_desbravador.utilitarios.PropertiesLoaderImpl;

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
        testeCon = con.getConexao(
                PropertiesLoaderImpl.getValor("servidor"),
                PropertiesLoaderImpl.getValor("porta"),
                PropertiesLoaderImpl.getValor("banco"),
                PropertiesLoaderImpl.getValor("usuario"),
                PropertiesLoaderImpl.getValor("senha"));
        System.out.println(testeCon + "\n" + con.getMensagemRet());
    }
}
