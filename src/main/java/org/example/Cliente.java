package org.example;

public class Cliente {

    private int id;
    private String nome;
    private String item;
    private double preco;


    public Cliente(int id, String nome, String item, double preco) {
        this.id = id;
        this.nome = nome;
        this.item = item;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Dados do Cliente: " + "\n ID:"
                + id + " " + " Nome do cliente: " + nome + " " + "\nProduto: " + item + " " +
                "\nTotal a pagar: " + preco;
    }
}

