/*
Elabore um programa que cria uma Revenda e 
oferece um menu com operações para criar produto, 
comprar, vender,consultar preço, listar preco 
além de consultar e alterar os atributos valor de compra, 
custo e margem de lucro em um
determinado produto; 
 */
package com.mycompany.exercicio01aps;

import java.util.Scanner;

public class Menu {
    private String descricao;
    private Scanner entrada = new Scanner(System.in);

    Menu(String interfaceConsole) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public Produto criaProduto(RevendaComArray revenda){
        System.out.println("Preencha");
        int codigo = entrada.nextInt();
        String descricao = entrada.next();
        double vl_compra = entrada.nextDouble();
        double custo = entrada.nextDouble();
        double margem_lucro = entrada.nextDouble();
        int qtd_estoque = entrada.nextInt();
        
        Produto novo = new Produto(codigo, descricao, vl_compra, custo, margem_lucro, qtd_estoque);
        return null;   
    }
    
    public void comprarProduto(RevendaComArray revenda){
        int codigo = entrada.nextInt();
        int quant = entrada.nextInt();
        
        revenda.comprar(codigo, quant);
    }
    
    public void venderProduto(RevendaComArray revenda){
        int codigo = entrada.nextInt();
        int quant = entrada.nextInt();
        
        revenda.vender(codigo, quant);
    }
    
    public void consultaPreco(RevendaComArray revenda){
        int codigo = entrada.nextInt();
        
        revenda.consultaPrecoVenda(codigo);
    }
    
    public void listarPrecos(RevendaComArray revenda){
        revenda.listaPrecos();
    }
    
    
    
}
