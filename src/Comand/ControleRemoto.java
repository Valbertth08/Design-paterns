package Comand;

import java.util.ArrayList;
import java.util.List;
public class ControleRemoto {

    private List<Comando> comandos= new ArrayList<>();

    public void addComandos(Comando comando){
        comandos.add(comando);
    }

   public  void execute(){
       for (Comando com :comandos){
            com.executar();
       }
   }
}
