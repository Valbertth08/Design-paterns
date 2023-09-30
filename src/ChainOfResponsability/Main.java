package ChainOfResponsability;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> listaProdutos= new ArrayList<>();
        listaProdutos.add(new Produto("Mouse",30.00,EnumCategoriaProduto.ELETRONICO));
        listaProdutos.add(new Produto("Teclado",1000.00,EnumCategoriaProduto.ELETRONICO));
        listaProdutos.add(new Produto("Teclado",2000.00,EnumCategoriaProduto.ELETRONICO));
        listaProdutos.add(new Produto("Teclado",3000.00,EnumCategoriaProduto.ELETRONICO));

        DescontoCompraMaisDe6Produtos desconto1 = new DescontoCompraMaisDe6Produtos();
        DescontoCompraTotal desconto2= new DescontoCompraTotal();
        DescontoProdutoEletronico desconto3= new DescontoProdutoEletronico();

        desconto1.proximo= desconto2;
        desconto2.proximo=desconto3;

        desconto1.calcularDesconto(listaProdutos);

    }
}
