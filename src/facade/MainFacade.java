package facade;

public class MainFacade {

    public static void main(String[] args) {

        ComputadoraFacade computadora = new ComputadoraFacade();

        computadora.iniciarComputadora();

        System.out.println();

        computadora.apagarComputadora();
    }
}