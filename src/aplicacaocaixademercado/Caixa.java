/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaocaixademercado;
// 28054481-a3b9-4c89-adae-e94db61f3782

import java.util.*;

/**
 *
 * @author Pichau
 */
public class Caixa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Registradora novaRegistradora = new Registradora();
        Scanner in = new Scanner(System.in);
        int opcaoMenu = 0, codigoDeBarras = 0, qtdItem = 0;

        System.out.println("Bem vindo, operador!\n");
        while (opcaoMenu != 2) {
            System.out.println("Selecione abaixo, a operação desejada:\n"
                    + "1 - Para inicar uma venda;\n"
                    + "2 - Para Encerrar a aplicação.");
            opcaoMenu = in.nextInt();

            switch (opcaoMenu) {
                case 1:
                    novaRegistradora.iniciarVenda();
                    System.out.println("Venda Iniciada.\n");
                    int opcaoSubmenu = 0;
                    while (opcaoSubmenu != 3) {
                        System.out.println(
                                "\nSelecione uma opção:\n"
                                + "1 - Incluir Item na lista;\n"
                                + "2 - Para Encerrar a venda;\n"
                                + "3 - Realizar o pagamento."
                        );
                        opcaoSubmenu = in.nextInt();
                        switch (opcaoSubmenu) {
                            case 1:
                                System.out.println("\nDigite o Código de Barras:");
                                codigoDeBarras = in.nextInt();
                                System.out.println("Indique a quantidade:");
                                qtdItem = in.nextInt();
                                String novoItem = novaRegistradora.incluirItem(codigoDeBarras, qtdItem);
                                System.out.println(novoItem);
                                // System.out.println(itemCompra);
                                break;
                            case 2:
                                System.out.println("Resumo da compra: "
                                        + novaRegistradora.gerarResumoVenda());
                                System.out.println("Sua compra deu um total de: "
                                        + novaRegistradora.concluirVenda()
                                );
                                System.out.println("Prossiga para o pagamento.");
                                break;
                            case 3:
                                System.out.println("Digite o o valor a pagar: ");
                                do {
                                    novaRegistradora.efetuarPagamento(in.nextFloat());

                                    if (novaRegistradora.calcularTroco() < 0) {
                                        System.out.println("O valor pago é insuficiente.");
                                    }

                                } while (novaRegistradora.calcularTroco() < 0);

                                System.out.println("Seu troco é de: " + novaRegistradora.calcularTroco());

                                break;
                            default:
                                System.out.println("Opção Inválida.");

                        }
                    }
                    break;
                case 2:
                    System.out.println("Aplicação encerrada. Até logo!");
                    break;
                default:
                    System.out.println("Opção Inválida.");
            }
        }

    }

}
