package Cliente;

public class Cliente { //classe -> Cliente
    public String nome;
    public String cpf;
    public String endereco;
    public String profissao;
    public int idCliente;
    public int saldoCliente;

    //método contrutor
    public void Cliente(String nome, String cpf, String endereco, String profissao, int idCliente, int saldoCliente){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.profissao = profissao;
        this.idCliente = idCliente;
        this.saldoCliente = saldoCliente;
    }


}
