import br.com.browbank.model.Conta;


public class main {


    public static void main(String []args){

        Conta minhaConta = new Conta("Bruno Palma", "38585403829", 001, 100.00);
        Conta segundaConta = new Conta("Vitor Lenk", "39015648883", 002, 100.00);



        System.out.println(minhaConta.dadosConta("38585403829"));
        System.out.println(minhaConta.saldoAtual(001));



    }

}
