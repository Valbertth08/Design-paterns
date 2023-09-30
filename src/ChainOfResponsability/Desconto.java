package ChainOfResponsability;

import java.util.List;

abstract class Desconto {

     public Desconto proximo;


     public abstract void calcularDesconto(List<Produto> list);


}
