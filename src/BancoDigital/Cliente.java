package BancoDigital;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String nomeCompleto;
    private int idade;

    public Cliente(String nomeCompleto, int idade) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }
}
//
