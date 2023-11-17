package Visitor;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        FormatoConvite1 formato1= new FormatoConvite1();
        FormatoConvite2 formato2= new FormatoConvite2();
        GerenciadorEvento gerenciadorEvento= new GerenciadorEvento();
        gerenciadorEvento.addEvento(new Conferencia(LocalDate.parse("17/11/2023",date),"Conferencia de Computação"));
        gerenciadorEvento.addEvento(new Reuniao(LocalDate.parse("18/11/2023",date),"Reunião sobre  investimento"));
        gerenciadorEvento.addEvento(new Festa(LocalDate.parse("19/11/2023",date),"Festa de Inauguração"));


        gerenciadorEvento.EnviaMensagem(formato1);
        gerenciadorEvento.EnviaMensagem(formato2);



    }
}
