package Facade;

public class Financeiro {

    public  void receberPagamento(Integer codigo, Double valor, String nome){
        System.out.println("---------------------------------------------------------------");
        System.out.println("PAGAMENTO EFETUADO COM SUCESSO:\nCodigo: "+codigo+"\nValor: "+String.format("%.2f",valor)+"\nNome: "+nome);
    }
}
