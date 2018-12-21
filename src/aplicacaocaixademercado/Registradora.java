/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaocaixademercado;

/**
 *
 * @author Pichau
 */
public class Registradora {

    private final CatalogoProdutos catalogoEspec;
    private Venda minhaVenda;

    public Registradora() {
        catalogoEspec = new CatalogoProdutos();
    }

    public void iniciarVenda() {
        minhaVenda = new Venda();

    }

    /*public void incluirEspecProdutos(){
        catalogoEspec.incluirEspecProduto(0, descricao, 0);
    }*/
    public String incluirItem(int codBarras, int quantidade) {
        EspecProduto itemAIcluir = catalogoEspec.getEspecificacao(codBarras);
        if (itemAIcluir != null) {
            return minhaVenda.inserirItemDeVenda(itemAIcluir, quantidade);
        }
        return "\nCodigo de barras inválido.";

    }

    public String gerarResumoVenda() {
        return minhaVenda.getListaFinaldeCompra();
    }

    public float concluirVenda() {
        return minhaVenda.getTotal();
    }

    public void efetuarPagamento(float valorPago) {
        minhaVenda.efetuarPagamento(valorPago);
    }

    public float calcularTroco() {
        return minhaVenda.getTroco();
    }
}
