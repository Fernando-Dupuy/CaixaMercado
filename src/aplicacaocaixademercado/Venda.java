/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaocaixademercado;

import java.util.*;

/**
 *
 * @author 149131107
 */
public class Venda {

    private ArrayList<ItemDeVenda> itensDeVenda;
    private Pagamento novoPagamento;

    public Venda() {
        itensDeVenda = new ArrayList<>();
    }

    public String inserirItemDeVenda(EspecProduto especProduto, int quantidade) {
        ItemDeVenda novoItem = new ItemDeVenda(especProduto, quantidade);
        itensDeVenda.add(novoItem);
        ItemDeVenda itemIncluso = itensDeVenda.get(itensDeVenda.indexOf(novoItem));
        return itemIncluso.toString();
    }

    public float getTotal() {
        float total = 0;
        for (ItemDeVenda item : itensDeVenda) {
            total += item.getSubtotal();
        }

        return total;
    }

    public void efetuarPagamento(float valorPago) {
        novoPagamento = new Pagamento();
        novoPagamento.setValorPago(valorPago);
    }

    public float getTroco() {

        return novoPagamento.getValorPago() - this.getTotal();
    }

    public String getListaFinaldeCompra() {
        String listaFinal = "";
        for (ItemDeVenda item : itensDeVenda) {
            listaFinal += item.toString();
        }
        return listaFinal;
    }
}
