package BancoDigital;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    protected void ImprimirExtratoCP(){
        System.out.println("----Extrato BancoDigital.Conta Poupanca----");
        imprimirExtrato();
    }
}
//