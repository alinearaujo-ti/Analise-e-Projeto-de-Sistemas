/* 
 */
package com.mycompany.exercicio01aps;

import java.util.ArrayList;

public class RevendaComArray {
    private int indice;
    private ArrayList<Produto> produtos;
    private int codigo;

    //Um construtor que recebe como argumento a quantidade de produtos e inicializa o atributo "produtos" com um
    //array de produtos com o tamanho especificado;
    public RevendaComArray(int quant) {
       this.produtos = new ArrayList<>();
        this.indice = indice;
        for(int i = 0; i < indice ;i++){
            this.produtos.add(new Produto());
        }
    }

    //Um método "inserirProduto" que recebe como parâmetro um Produto e o insere no array;  
    public void inserirProduto(Produto produto, int id){
                this.produtos.set(id, produto); 
    }
    
    //Um método "comprar" que recebe como parâmetro 
    //o código de um Produto e quantidade de unidades 
    //deste produto que foi adquirida pela revenda, 
    //percorre o array procurando o Produto e 
    //incrementa a quantidade em estoque deste produto,
    //caso ele não exista, o método deve imprimir uma
    //mensagem de erro;
    public void comprar(int codigo, int quant){
        for(int i = 0; i < indice; i++){
            if( this.codigo == produtos.get(i).codigo){
                this.produtos.get(i).compra(quant);
                break;
            } else {
                System.out.println("Erro");
            }
        }
    }
  
    //Um método "vender" que recebe como parâmetro o 
    //código de um Produto e quantidade de unidades deste
    //produto que foi vendida pela revenda, percorre 
    //o array procurando o Produto e decrementa a quantidade em
    //estoque deste produto, caso ele não exista, 
    //o método deve imprimir uma mensagem de erro;
    public void vender(int codigo, int quant){
        for(int i = 0; i < indice; i++){
            if(this.produtos.get(i).getCodigo() == codigo){
                this.produtos.get(i).venda(quant);
            }else{
                System.out.println("Erro");}
        }
    }
    
    //Um método "consultaPrecoVenda" que recebe como 
    //parâmetro o código de um Produto, percorre o 
    //array procurando o Produto e imprime o valor 
    //de venda deste produto, caso ele não exista, 
    //o método deve imprimir uma mensagem de erro;
    public void consultaPrecoVenda(int codigo){
        for(int i = 0; i < indice; i++){
            if(this.produtos.get(i).getCodigo() == codigo){
                System.out.println("Produto: " + this.produtos.get(i).descricao);
                System.out.println("Valor de venda:" + this.produtos.get(i).calculaPrecoVenda());
            }else{
                System.out.println("Erro");
            }
        }
    }
    
    //Um método "listaPrecos" que imprime o código, 
    //a descrição e o valor de venda de todos os produtos;
    public void listaPrecos(){
        for(int i = 0; i < indice; i++){
            
            System.out.println("Codigo: " + this.produtos.get(i).codigo);
            System.out.println("Descricao: " + this.produtos.get(i).descricao);
            System.out.println("Valor de Venda: " + this.produtos.get(i).calculaPrecoVenda());
        }
    }
    
    //além de consultar e alterar os atributos valor de compra, custo e margem de lucro em um
    //determinado produto; 
    public ArrayList<Produto> getProduto(int codigo){
        for(int i = 0; i < indice; i++){
            if(this.produtos.get(i).getCodigo() == codigo){
                return produtos;
            }else{
                System.out.println("Erro");
            }
        }
        return null;
    }

    void inserirProduto(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
