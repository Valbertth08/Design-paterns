package Bridge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Bem vindo a tela de cadastro-----");
        System.out.print("Informe seu usuario: ");
        String user= sc.next();
        System.out.print("Informe sua senha: ");
        int senha= sc.nextInt();
        System.out.println("Como deseja receber as notificação da sua conta: \n1.Email\n2.Sms");
        int opcao = sc.nextInt();
        if(opcao == 1){
            User us = new User(user,senha,new NotificacaoEmail());
            us.getNotificacao().notificar();
        }
        else{
            User us = new User(user,senha,new NotificacaoSms());
            us.getNotificacao().notificar();
        }

    }
}
