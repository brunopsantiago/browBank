package br.com.browbank.model;

public class Conta {


    String nome;
    String cpf;
    int numConta;
    double saldo;

    public double saldoAtual(int numConta){
        this.saldo = saldo;
        return this.saldo;
    }

    public Conta dadosConta(String cpf){
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
        return this;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public int getNumConta() { return numConta; }

    public void setNumConta(int numConta) { this.numConta = numConta; }

    public double getSaldo() { return saldo; }

    public void setSaldo(double saldo) { this.saldo = saldo; }

    public Conta(String nome, String cpf, int numConta, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", numConta=" + numConta +
                ", saldo=" + saldo +
                '}';
    }
}
