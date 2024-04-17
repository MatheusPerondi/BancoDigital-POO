package BancoDigital;

public class Conta {

    private static int sequencial = 1;
    private static final int agenciaPadrao = 1;
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    
    public Conta(Cliente cliente) {
        this.agencia = Conta.agenciaPadrao;
        this.numeroConta = sequencial++;
        this.cliente = cliente;
    }

    protected void depositar(double valor){
        saldo += valor;
    }

    protected void sacar(double valor){
        saldo -= valor;
    }

    protected void transferir(double valor, Conta conta){
        this.sacar(valor);
        conta.depositar(valor);
    }

    protected void imprimirExtrato(){
        System.out.println(String.format("Titular:  %s  ", this.cliente.getNomeCompleto()));
        System.out.println(String.format("Agencia:  %d  ", this.agencia));
        System.out.println(String.format("Numero da conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo R$%.2f", this.saldo));
    }
}
