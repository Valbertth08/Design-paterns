package Composite;

import java.util.ArrayList;
import java.util.List;

public class CaixaDeJogo implements CompositeCaixa {

    List<CompositeCaixa> compositeCaixas;

   public CaixaDeJogo(){

       this.compositeCaixas=new ArrayList<>();
   }
   public void addJogo(CompositeCaixa comp){
       compositeCaixas.add(comp);
   }
    @Override
    public void mostrarJogo() {
        for ( CompositeCaixa comp: compositeCaixas){
                comp.mostrarJogo();
        }
    }
}
