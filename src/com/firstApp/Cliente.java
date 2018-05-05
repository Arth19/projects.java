package com.firstApp;

public class Cliente extends Pessoa {

    private int qtdFilmes;
    private Filme filme;
    private int credito;

    public Cliente(String nome, int idade, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;

    }
    public int getQtdFilmes() {
        return qtdFilmes;
    }

    public void setQtdFilmes(int qtdFilmes) {
        this.qtdFilmes = qtdFilmes;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
    public void compraCredito(double dinheiro){
        this.credito += dinheiro*(dinheiro/4);
    }
    public static class Endereço {
       private String rua;
       private String bairro;
       private String estado;
       private String regiao;
       private int numero;

       public String getRua() {
           return rua;
       }

       public void setRua(String rua) {
           this.rua = rua;
       }

       public String getBairro() {
           return bairro;
       }

       public void setBairro(String bairro) {
           this.bairro = bairro;
       }

       public String getEstado() {
           return estado;
       }

       public void setEstado(String estado) {
           this.estado = estado;
       }

       public String getRegiao() {
           return regiao;
       }

       public void setRegiao(String regiao) {
           this.regiao = regiao;
       }

       public int getNumero() {
           return numero;
       }

       public void setNumero(int numero) {
           this.numero = numero;
       }


   }
}
