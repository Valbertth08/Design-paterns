    package Decorator;

    public class Main {
        public static void main(String[] args) {

            CafeBasico cafe = new CafeContreto();

            CafeDecorator cafeDecorator= new CafeDecorator1(cafe);
            cafeDecorator.exibirIgredientes();

            CafeDecorator cafeDecorator2= new CafeDecorator2(cafe);
            cafeDecorator2.exibirIgredientes();


        }
    }
