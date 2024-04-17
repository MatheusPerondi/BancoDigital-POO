package BancoDigital;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Informe a sua idade: ");
        int idade = scanner.nextInt();

        String nomeCompleto = nome + sobrenome;

        Cliente matheus = new Cliente(nomeCompleto, idade);

        Conta cc = new ContaCorrente(matheus);
        Conta cp = new ContaPoupanca(matheus);

        cc.depositar(1500);
        cp.depositar(1000);
        cc.transferir(500, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
