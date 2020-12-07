
package com.mycompany.exercicio01aps;

public class Produto {
    int codigo;
    String descricao;
    private double vl_compra;
    private double custo;
    private double margem_lucro;
    private int qtd_estoque;    

    
    
    Produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Produto(int parseInt, String string, double parseDouble, double parseDouble0, double parseDouble1, int parseInt0, int parseInt1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //métodos:
    void compra(int quant){
        qtd_estoque = qtd_estoque + quant;
    }
    
    void venda(int quant){
        qtd_estoque = qtd_estoque - quant;
    }
    
    double calculaPrecoVenda( ){
        return vl_compra + custo + margem_lucro*(vl_compra + custo); 
    }
    
    //crie métodos getAtributo e setAtributo para os atributos: 
    //valor de compra, custo e margem de lucro
    public double getVl_compra() {
        return vl_compra;
    }

    public void setVl_compra(double vl_compra) {
        this.vl_compra = vl_compra;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getMargem_lucro() {
        return margem_lucro;
    }

    public void setMargem_lucro(double margem_lucro) {
        this.margem_lucro = margem_lucro;
    }
  
    //crie um construtor para inicializar o valor dos atributos: código e descrição
    public Produto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    //crie um construtor para inicializar o valor dos atributos: código, descrição, valor de compra, custo e margem de lucro
    public Produto(int codigo, String descricao, double vl_compra, double custo, double margem_lucro) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.vl_compra = vl_compra;
        this.custo = custo;
        this.margem_lucro = margem_lucro;
    }
    
    //crie um construtor para inicializar o valor dos atributos: código, descrição, valor de compra, custo, margem de lucro e quantidade em estoque
    public Produto(int codigo, String descricao, double vl_compra, double custo, double margem_lucro, int qtd_estoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.vl_compra = vl_compra;
        this.custo = custo;
        this.margem_lucro = margem_lucro;
        this.qtd_estoque = qtd_estoque;
    }

    int getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
