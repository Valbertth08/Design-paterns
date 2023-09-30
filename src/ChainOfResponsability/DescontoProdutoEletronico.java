package ChainOfResponsability;

import java.util.List;

public class DescontoProdutoEletronico extends Desconto {
    @Override
    public void calcularDesconto(List<Produto> list) {
        int tamanho = (int) list.stream().filter(x -> x.getCategoria().equals(EnumCategoriaProduto.ELETRONICO)).count();
        if (tamanho >= 4) {
            System.out.println("Desonto de 5%");
        } else if (proximo != null) {
            proximo.calcularDesconto(list);
        }

    }
}
