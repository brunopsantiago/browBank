package br.com.browbank.model;

public class Transferencia {

    int numConta1;
    int numConta2;
    double saldo;
    int numConta;
    Conta conta;

    public void transferir(int numConta1, int numConta2, double valorTransferir ){
        numConta1 = this.numConta;
        this.saldo = saldo - valorTransferir;
    }

    public void receberTransferencia(int numConta2, double valorTransferir) {
        this.numConta2 = numConta;
        this.saldo = saldo + valorTransferir;

    }
}
