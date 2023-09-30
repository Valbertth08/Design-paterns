package ChainOfResponsability;

import java.util.List;

public class DescontoCompraTotal extends Desconto {
    @Override
    public void calcularDesconto(List<Produto> list) {
        double soma = 0.0;
        for (Produto p : list) {
            soma += p.getPreco();
        }
        if (soma > 5000) {
            System.out.println("Desconto 7%");
        } else if (proximo != null) {
            proximo.calcularDesconto(list);
        }

    }

}
