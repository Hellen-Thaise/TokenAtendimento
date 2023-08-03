package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BD {
    private Scanner entrada = new Scanner(System.in);

    private Cliente cliente;
    private ArrayList<Cliente> lista = new ArrayList<>();

    private int id = 0;
    private int escolhaLanche;
    private int escolhaBebida;
    private int quantidade;
    private int opcao;
    private int contador=0;
    private int opcaoPagamento;
    private String item;
    private String nome;
    private double preco;
    private double total;
    private double soma;
    private double valor;

    public void inserir(){

        try {
            System.out.println("Digite o seu nome:");
            nome=entrada.next();

            System.out.println("------------------------------------------");

            System.out.println("Digite sua escolha: ");
            System.out.println("| 1 - Lanche                             |");
            System.out.println("| 2 - Bebida                             |");
            System.out.println("------------------------------------------");

            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("Escolha o seu lanche: ");

                    System.out.println("1- X -  Burguer ");
                    System.out.println("2- X - Salada ");
                    escolhaLanche = entrada.nextInt();

                    System.out.println("Digite a quantidade:");
                    quantidade = entrada.nextInt();


                    if ( escolhaLanche == 1 ){
                        preco = 10.00;
                        total = quantidade*preco;
                        item = "X-Burger";
                    }else {
                        preco=12.00;
                        total = quantidade*preco;
                        item = "X-Salada";
                    }

                    break;

                case 2:
                    System.out.println(" Escolha a sua bebida: ");

                    System.out.println("1- Refrigerantes ");
                    System.out.println("2- Sucos ");
                    escolhaBebida = entrada.nextInt();

                    System.out.println("Digite a quantidade:");
                    quantidade = entrada.nextInt();


                    if ( escolhaBebida == 1 ){

                        preco = 8.00;
                        total = quantidade*preco;
                        item="Refrigerante";

                    }else {
                        preco=6.00;
                        total=quantidade*preco;
                        item="Suco";
                    }

                    break;

                default:
                    System.out.println("Opção inválida! ");

            }
            soma+=total;
            contador+=quantidade;

            System.out.println("Quantidade de itens: " + contador +
                    "\n Valor total: " + soma);

            System.out.println(" Forma de pagamento: ");
            System.out.println("\n 1 - Crédito");
            System.out.println("\n 2 - Débito");
            System.out.println("\n 3 - Dinheiro");

            opcaoPagamento= entrada.nextInt();

            if (opcaoPagamento==1 || opcaoPagamento==2){
                System.out.println("Pagamento Realizado com sucesso! ");
            }else {
                System.out.println("Digite o valor a ser pago:");
                valor= entrada.nextInt();
                if (valor<preco){
                    System.out.println("Saldo em dinheiro insuficiente!");
                }else {
                    System.out.println("Pagamento Realizado com Sucesso");
                }
            }

            id++;

            cliente= new Cliente(id,nome,item,soma);
            lista.add(cliente);

            for (Cliente c:lista) {
                System.out.println(c);
            }
            cliente.setId(id);

        }   catch (InputMismatchException e){

            System.out.println(" Formato inválido, digite um numero! ");

        }

    }

    public void deletar(){
        System.out.println("Digite o id do pedido que deseja deletar:");
        id=entrada.nextInt();
        if (id==cliente.getId()){
            lista.remove(cliente);
            System.out.println(" Removido com sucesso! ");
        }else {
            System.out.println("ID não consta no sistema ");
        }
    }

    public  void atualizar(){
        System.out.println("Digite o id do pedido que deseja atualizar:");
        id=entrada.nextInt();
        if (id==cliente.getId()){
            try {
                System.out.println("Digite o seu nome:");
                nome=entrada.next();


                System.out.println("Faça seu pedido: ");
                System.out.println("1- Lanche ");
                System.out.println("2- Bebida ");
                opcao = entrada.nextInt();

                switch (opcao) {

                    case 1:

                        System.out.println("Escolha o seu lanche: ");

                        System.out.println("1- X -  Burguer ");
                        System.out.println("2- X - Salada ");
                        escolhaLanche = entrada.nextInt();

                        System.out.println("Digite a quantidade:");
                        quantidade = entrada.nextInt();


                        if ( escolhaLanche == 1 ){
                            preco = 10.00;
                            total = quantidade*preco;
                            item="X-Burger";
                        }else {
                            preco=12.00;
                            total = quantidade*preco;
                            item = "X-Salada";
                        }

                        break;

                    case 2:
                        System.out.println(" Escolha a sua bebida: ");

                        System.out.println("1- Refrigerantes ");
                        System.out.println("2- Sucos ");
                        escolhaBebida = entrada.nextInt();

                        System.out.println("Digite a quantidade:");
                        quantidade = entrada.nextInt();


                        if ( escolhaBebida == 1 ){

                            preco = 8.00;
                            total = quantidade*preco;
                            item = "Refrigerante";

                        }else {
                            preco=6.00;
                            total = quantidade*preco;
                            item = "Suco";
                        }


                        break;

                    default:
                        System.out.println("Opção inválida! ");

                }
                soma+=total;
                contador+=quantidade;

                System.out.println("Quantidade de itens: " + contador + "\n Valor total:" + soma);

                System.out.println("Digite a opção de pagamento! ");
                System.out.println("\n 1 - Crédito");
                System.out.println("\n 2 - Débito");
                System.out.println("\n 3 - Dinheiro");

                opcaoPagamento= entrada.nextInt();

                if (opcaoPagamento==1 || opcaoPagamento==2){
                    System.out.println("Pagamento Realizado com Sucesso! ");
                }else {
                    System.out.println("Digite o valor a ser pago:");
                    valor= entrada.nextInt();
                    if (valor<preco){
                        System.out.println("Saldo em dinheiro insuficiente!");
                    }else {
                        System.out.println("Pagamento Realizado com Sucesso! ");
                    }
                }

                cliente= new Cliente(id,nome,item,soma);
                lista.set(id-1,cliente);

                System.out.println(cliente.toString());


            }   catch (InputMismatchException e){

                System.out.println(" Formato invalido, digite um numero! ");

            }
        }else {
            System.out.println("ID não consta no sistema ");
        }
    }
}
