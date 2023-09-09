package Bridge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Cadastro-----");
        System.out.print("Informe seu usuario: ");
        String user= sc.next();
        System.out.print("Informe sua senha: ");
        int senha= sc.nextInt();
        System.out.println();
        System.out.println("Como deseja receber as notificação da sua conta: \n1.Email\n2.Sms");
        int opcao = sc.nextInt();
        User us = new User(user,senha);

        if(opcao == 1){
            ContaInstagram contaInstagram= new ContaInstagram(us,new NotificacaoEmail());
            contaInstagram.TipoDenotificacao();
        }
        else{
            ContaInstagram contaInstagram= new ContaInstagram(us,new NotificacaoSms());
            contaInstagram.TipoDenotificacao();;
        }

    }
}
