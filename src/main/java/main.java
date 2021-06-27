import br.com.browbank.model.Conta;
import br.com.browbank.model.Transferencia;


public class main {


    public static void main(String []args){

        Conta minhaConta = new Conta("Bruno Palma", "38585403829", 001, 100.00);
        Conta segundaConta = new Conta("Vitor Lenk", "39015648883", 002, 100.00);



        System.out.println(minhaConta.dadosConta("38585403829"));
        System.out.println(minhaConta.saldoAtual(001));


        Transferencia transfer = new Transferencia();
        transfer.transferir(001, 002, 10.00);
        transfer.receberTransferencia(002, 10.00);

        System.out.println(minhaConta.saldoAtual(001));
        System.out.println(segundaConta.saldoAtual(002));


    }

}
