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
public class ItemDeVenda {

    private int quantidade;
    private EspecProduto especItemdeVenda;

    ItemDeVenda(EspecProduto especItem, int quant) {
        especItemdeVenda = especItem;
        quantidade = quant;
    }

    public float getSubtotal() {
        return quantidade * especItemdeVenda.getPreco();
    }

    @Override
    public String toString() {
        return "\nItem Incluso{" + "\nProduto: " + especItemdeVenda.getDescricao() + " | Preço: " + especItemdeVenda.getPreco()
                + "\nQuantidade= " + this.quantidade + "\nTotal: " + this.getSubtotal() + '}';
    }

}
