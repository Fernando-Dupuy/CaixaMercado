/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaocaixademercado;

import java.util.*;

/**
 *
 * @author Pichau
 */
public class CatalogoProdutos {

    private final HashMap<Integer, EspecProduto> mapaProdutos;
    //private ConectorArquivos conector;

    public CatalogoProdutos() {
        mapaProdutos = new HashMap<>();
        incluirEspecProduto(12345, "Frango", 14.00f);
        incluirEspecProduto(12344, "Leite", 5.00f);
        incluirEspecProduto(12343, "Ovo", 1.00f);
        incluirEspecProduto(12342, "macarrao", 3.00f);
        incluirEspecProduto(12341, "farinha", 2.00f);

    }

    public void incluirEspecProduto(
            int numEspecProd,
            String descricao,
            float preco) {
        EspecProduto novaEspecProduto = new EspecProduto(
                numEspecProd,
                descricao,
                preco);
        mapaProdutos.put(novaEspecProduto.getNumEspecProd(), novaEspecProduto);
    }

    /* public void carregarEspecs(){
        conector = new ConectorArquivos("CatalogoEspecDB.txt");
        conector.popularCatalogo(mapaProdutos); 
    }*/
    public EspecProduto getEspecificacao(int codBarras) {
        return mapaProdutos.get(codBarras);
    }
}
