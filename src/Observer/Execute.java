package Observer;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Execute {
    public static void main(String[] args) {

        Produto produto = new Produto("Televisão",1300.00,1);

        produto.addInterassado(new Usuario("Carlos Andre",1));
        produto.addInterassado(new Usuario("Fabricio Ferreira",2));
        produto.addInterassado(new Usuario("Thomas Shelby",3));

        System.out.println();
        System.out.println("PREÇO ATUAL PARA O PRODUTO: "+String.format("%.2f.",produto.getPrice()));
        System.out.println();
        System.out.println("----LISTA ATUAL DE INTERESSADOS-----");
        produto.setPrice(600.00);

        System.out.println("------REMOVENDO 1 INTERESSADO---------");
        produto.removeInterassado(new Usuario("Thomas Shelby",3 ));
        for (notificarProduto n: produto.getNotificar()){
            System.out.println(n);
        }
        System.out.println();
        System.out.println("----LISTA DE INTERESSADOS ATUALIZADA/PREÇO PRODUTO-----");
        System.out.println();
        produto.setPrice(500.00);
    }
}
