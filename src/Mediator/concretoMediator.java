package Mediator;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class concretoMediator  implements Mediator{
  private   List<Motorista> motoristas = new ArrayList<>();
    private  Usuario usuario;

    public  void addMotorista(Motorista motorista){
        motoristas.add(motorista);
    }
    public  void  setUsuarios(Usuario usuario){

        this.usuario=usuario;
    }
    public void receberPreco() {
        Motorista motorista= motoristas.stream().min((x, y)->x.getPreco().compareTo(y.getPreco())).get();
        this.enviarMensagem(motorista);
    }

    @Override
    public void enviarMensagem(Motorista motorista) {
        if( motorista instanceof motoristaTaxi){
            usuario.receberPreco("Corrida com menor preco: \nMotorista de taxi: "+motorista.getName()+" \nPreço: "+motorista.getPreco());
        } else if (motorista instanceof  motoristaUber) {
            usuario.receberPreco("Corrida com menor preco: \nMotorista de uber: "+motorista.getName()+" \nPreço: "+motorista.getPreco());
        } else if (motorista instanceof  motoTaxi) {
            usuario.receberPreco("Corrida com menor preco: \nMoto Taxi: "+motorista.getName()+" \nPreço: "+motorista.getPreco());
        }

    }

}
