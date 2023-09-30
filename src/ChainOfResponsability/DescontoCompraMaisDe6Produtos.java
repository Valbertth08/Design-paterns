package ChainOfResponsability;

import java.util.List;

public class DescontoCompraMaisDe6Produtos  extends Desconto{

    @Override
    public void calcularDesconto(List<Produto> list) {
        if(list.size()>6){
            System.out.println("Desonto de 10%");
        } else if (proximo != null) {
            proximo.calcularDesconto(list);
        }
    }
}
