package Mediator;


public class motoTaxi  extends Motorista{
    public motoTaxi(String name, Double preco, Mediator mediator) {
        super(name, preco, mediator);
    }

    @Override
    Double enviarPreco(Motorista motorista) {
        return null;
    }
}
