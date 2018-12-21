/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaocaixademercado;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.nio.charset.StandardCharsets;
/**
 *
 * @author Pichau
 */
public class ConectorArquivos {
    private Path caminhoDoarquivo;
    private BufferedReader br;
    public ConectorArquivos(String uri){
        caminhoDoarquivo = Paths.get(uri);
    }
    
    public boolean popularCatalogo(HashMap<Integer,EspecProduto> mapaEspecs){
        
        return true;
    }
}
