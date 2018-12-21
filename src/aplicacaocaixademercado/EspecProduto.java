/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaocaixademercado;

/**
 *
 * @author 149131107
 */
public class EspecProduto {
    private int numEspecProd;
    private String descricao;
    private float preco;
    
    public EspecProduto(int numEspecProd, String descricao, float preco){
        this.numEspecProd = numEspecProd;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getNumEspecProd() {
        return numEspecProd;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setNumEspecProd(int numEspecProd) {
        this.numEspecProd = numEspecProd;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString() {
        return "EspecProduto{" + "\nidProduto= " + numEspecProd + "\nnomeProduto= " +
                descricao + "\nprecoProduto= " + preco + '}';
    }
}

