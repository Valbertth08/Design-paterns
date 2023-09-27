package Mediator;

public class Main {
    public static void main(String[] args) {

       concretoMediator concretoMediator= new concretoMediator();
       concretoMediator.addMotorista( new motoristaUber("Jose",5.00,concretoMediator));
       concretoMediator.addMotorista( new motoTaxi("Carlos",10.00,concretoMediator));
       concretoMediator.addMotorista( new motoristaTaxi("Pedro",33.00,concretoMediator));

       concretoMediator.setUsuarios(new Usuario("Carlos", 9892837L,concretoMediator));

       concretoMediator.receberPreco();

    }
}
