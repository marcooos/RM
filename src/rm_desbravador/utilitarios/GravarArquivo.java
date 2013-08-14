/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rm_desbravador.utilitarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author marcos
 */
public class GravarArquivo {

    public boolean gravarArquivoTexto(String texto, String nomeArquivo, String caminho) {                
        File arquivo;

        arquivo = new File(caminho+"/"+nomeArquivo+".txt");
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(arquivo);
            fos.write(texto.getBytes());            
            fos.close();
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            return false;
        } catch (IOException ex) {
            System.out.println(ex);
            return false;
        }        
    }
    
    public boolean lerArquivoTexto(String texto, String nomeArquivo) {
        File arquivo;
        arquivo = new File(nomeArquivo);
        FileInputStream fis;
        try {
            fis = new FileInputStream(arquivo);
            int ln;
            while ((ln = fis.read()) != -1) {
                System.out.print((char) ln);
            }
            fis.close();
            return true;
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            return false;
        } catch (IOException ex) {
            System.out.println(ex);
            return false;
        }
    }
}
