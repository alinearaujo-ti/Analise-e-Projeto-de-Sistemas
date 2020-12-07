
package com.mycompany.exercicio01aps;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    RevendaComArray revenda = new RevendaComArray(0);
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("MENU - digite algum dos seguintes comandos corretamente");
    System.out.println("| iniciar + (quantidade)| \n ");
    System.out.println("| inserirProd + (código, descrição, valor de compra, custo, margem de lucro e quantidade em estoque)| \n ");
    System.out.println("| comprar + (codigo, quantidade)| \n ");
    System.out.println("| vender + (codigo, quantidade)| \n ");
    System.out.println("| consultarPrecoVenda + (codigo)| \n");
    System.out.println("| listar| ");
    
        OUTER:
        while (true) {
            String linha = entrada.nextLine();
            String[] texto = linha.split(" ");
            switch (texto[0]) {
                case "sair":
                    break OUTER;
                case "iniciar":
                    revenda = new RevendaComArray(Integer.parseInt(texto[1]));
                    break;
                case "inserirProd":
                    revenda.inserirProduto(new Produto(Integer.parseInt(texto[1]), (texto[2])));
                    break;
                case "comprar":
                    revenda.comprar(Integer.parseInt(texto[1]), Integer.parseInt(texto[2]));
                    break;
                case "vender":
                    revenda.vender(Integer.parseInt(texto[1]), Integer.parseInt(texto[2]));
                    break;
                case "consultaPrecoVenda":
                    revenda.consultaPrecoVenda(Integer.parseInt(texto[1]));
                    break;
                case "listar":
                    revenda.listaPrecos();
                    break;
                default:
                    System.out.println("Comando Inválido");
                    break;
            }
        }
    entrada.close();
    }
    
}
