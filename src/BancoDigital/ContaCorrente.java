package BancoDigital;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    protected void ImprimirExtratoCC(){
        System.out.println("----Extrato BancoDigital.Conta Corrente----");
        imprimirExtrato();
    }
}
//