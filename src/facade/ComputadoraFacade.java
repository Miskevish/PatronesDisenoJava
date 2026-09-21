package facade;

public class ComputadoraFacade {

    private FuenteEnergia fuenteEnergia;
    private SistemaOperativo sistemaOperativo;
    private ConexionRed conexionRed;

    public ComputadoraFacade() {
        fuenteEnergia = new FuenteEnergia();
        sistemaOperativo = new SistemaOperativo();
        conexionRed = new ConexionRed();
    }

    public void iniciarComputadora() {

        System.out.println("Iniciando computadora...");

        fuenteEnergia.encender();
        sistemaOperativo.iniciar();
        conexionRed.conectar();

        System.out.println("Computadora lista para usar.");
    }

    public void apagarComputadora() {

        System.out.println("Apagando computadora...");

        conexionRed.desconectar();
        sistemaOperativo.cerrar();
        fuenteEnergia.apagar();

        System.out.println("Computadora apagada.");
    }
}