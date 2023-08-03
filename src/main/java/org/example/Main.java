package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcao = 0;
        boolean run = true;
        BD inserir = new BD();

        ArrayList<Cliente> lista = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("-----------------------------------------------------");
            System.out.println("               TOKEN AUTO-ATENDIMENTO                ");
            System.out.println("-----------------------------------------------------");
            System.out.println("Sistema de compras, digite uma opção! ");
            System.out.println("1- Inserir no carrinho");
            System.out.println("2- Deletar do carrinho");
            System.out.println("3- Atualizar");
            opcao= sc.nextInt();
            switch (opcao){
                case 1:
                    inserir.inserir();
                    break;
                case 2:
                    inserir.deletar();
                    break;
                case 3:
                    inserir.atualizar();
            }

        }
    }
}